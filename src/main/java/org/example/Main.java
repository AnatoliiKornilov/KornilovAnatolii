package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    AllUsersList allUsersList = new AllUsersList();
    EnrichmentService enrichmentService = new EnrichmentService(List.of(new EnrichByMsisdn()));
    Message message =
        new Message( new HashMap(Map.of(
                    "action",
                    "button_click",
                    "page",
                    "book_card",
                    "msisdn",
                    "88005553535")),
            Message.EnrichmentType.MSISDN);
    allUsersList.addUser(new User(message.content));
    System.out.println(AllUsersList.allUsersList.get(0).info);
    enrichmentService.enrich(message);
    System.out.println(message.content);
    allUsersList.updateUserByMsisdn(message.content.get("msisdn"), allUsersList.findByMsisdn(message.content.get("msisdn")));
    System.out.println(AllUsersList.allUsersList.get(0).info);
    Message message2 = new Message(null, null);
    allUsersList.addUser(new User(message2.content));
  }
}