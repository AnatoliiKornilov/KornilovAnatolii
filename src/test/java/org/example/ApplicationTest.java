package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
  @Test
  void workedEnrichedMessage() {
    AllUsersList allUsersList = new AllUsersList();
    EnrichmentService enrichmentService = new EnrichmentService(List.of(new EnrichByMsisdn()));
    Message message = new Message(new HashMap(Map.of("page", "book_card", "msisdn", "88005553535")), Message.EnrichmentType.MSISDN);
    Message enrichedMessage = new Message(new HashMap(Map.of(
                    "page", "book_card",
                    "msisdn", "88005553535",
                    "firstName", "Harry",
                    "lastName", "Potter")),
            Message.EnrichmentType.MSISDN);
    allUsersList.addUser(new User(message.content));
    enrichmentService.enrich(message);
    allUsersList.updateUserByMsisdn(message.content.get("msisdn"), new User(message.content));
    assertEquals(enrichedMessage, message);
  }

  @Test
  void workedEnrichingInConcurrent() throws InterruptedException {
    Message message = new Message(new HashMap(
                Map.of("firstName", "Harry", "lastName", "Potter", "msisdn", "81234567890")),
            Message.EnrichmentType.MSISDN);
    Message m = new Message(new HashMap(Map.of("firstName", "Ronald", "lastName", "Weasley", "msisdn", "88888888888")),
            Message.EnrichmentType.MSISDN);
    AllUsersList allUsersList = new AllUsersList();
    EnrichmentService enrichmentService = new EnrichmentService(List.of(new EnrichByMsisdn()));
    List<Message> enrichmentResults = new CopyOnWriteArrayList<>();
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    CountDownLatch latch = new CountDownLatch(5);
    for (int i = 0; i < 10; i++) {
      executorService.submit(
          () -> {
            allUsersList.addUser(new User(m.content));
            enrichmentResults.add(enrichmentService.enrich(m));
            allUsersList.updateUserByMsisdn(m.content.get("msisdn"), new User(m.content));
            latch.countDown();
          });
    }
    latch.await();
    for (Message mess : enrichmentResults) {
      assertEquals(mess, message);
    }
  }
}