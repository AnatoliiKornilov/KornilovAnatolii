package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnrichByMsisdnTest {

  @Test
  void testEnrichMessage() {
    EnrichByMsisdn enriching = new EnrichByMsisdn();
    Message message = new Message(new HashMap(Map.of("msisdn", "88005553535")), Message.EnrichmentType.MSISDN);
    Message m = new Message(new HashMap(Map.of("firstName", "Harry", "lastName", "Potter", "msisdn", "88005553535")), Message.EnrichmentType.MSISDN);
    enriching.enrich(message);
    assertEquals(message, m);
  }
}