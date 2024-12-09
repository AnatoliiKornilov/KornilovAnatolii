package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllUsersList {

  protected static List<User> allUsersList = Collections.synchronizedList(new ArrayList<>());

  public User findByMsisdn(String msisdn) {
    synchronized (allUsersList) {
      for (User user : allUsersList) {
        if (user.info.containsValue(msisdn)) {
          return user;
        }
      }
      return null;
    }
  }

  public void updateUserByMsisdn(String msisdn, User user) {
    synchronized (allUsersList) {
      User searchResult = findByMsisdn(msisdn);
      if (searchResult != null) {
        searchResult = user;
      }
    }
  }

  public void addUser(User user) {
    if (user == null) {
      return;
    }
    allUsersList.add(user);
  }
}