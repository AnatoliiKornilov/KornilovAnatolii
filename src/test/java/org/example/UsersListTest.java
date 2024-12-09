package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class UsersListTest {

  @Test
  void testFindUser() {
    AllUsersList usersList = new AllUsersList();
    User userForComparison = new User(Map.of("Name", "Ronald", "msisdn", "88888888888"));
    usersList.addUser(new User(new HashMap(Map.of("Name", "Ronald", "msisdn", "88888888888"))));
    User user = usersList.findByMsisdn("88888888888");

    assertEquals(user, userForComparison);
  }
}