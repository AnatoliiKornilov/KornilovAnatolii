package org.example;

import java.util.Map;
import java.util.Objects;

public class User {
  protected Map<String, String> info;

  public User(Map<String, String> userInfo) {
    this.info = userInfo;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof User user)) {
      return false;
    }
    return Objects.equals(info, user.info);
  }
}