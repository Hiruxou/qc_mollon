package com.github;

import java.util.Scanner;

public class HelloChatBot {

  /**
   * Distribute.
   * @param str for respons.
   */
  public void listen(String str, String name) {
    if (str.equals("@hello")) {
      hello(name);
    } else if (str.equals("++")) {
      exit();
    } else if (str.equals("@time")) {
      time();
    } else if (str.equals("@foo")) {
      foo();
    }
  }

  private void hello(String name) {
    TimeDate currentDateTime = new TimeDate();
    System.out.println("[hello] Salut " + name + "!");
  }

  private void time() {
    TimeDate currentDateTime = new TimeDate();
    System.out.println("[time] Nous sommes " 
        + currentDateTime.currentDateFormat() + "et il est " + currentDateTime.currentTimeFormat()
        + ".");
  }

  private void foo() {
    System.out.println("[system] Je ne connais pas le chatbot @foo!");
  }

  private void exit() {
    System.exit(0);
  }
}