package com.github;

import java.util.Scanner;

public class ChatBot {

  /**
   * Distribute.
   * @param str for respons.
   */
  public void listen(String str, String name) {
    if (str.equals("@hello")) {
      hello(str, name);
    } else if (str.equals("++")) {
      exit();
    }    
  }

  private void hello(String str, String name) {
    TimeDate currentDateTime = new TimeDate();
    System.out.println("[hello] Salut " + name + "! Nous sommes " 
        + currentDateTime.currentDateFormat() + "et il est " + currentDateTime.currentTimeFormat()
        + ".");
  }

  private void exit() {
    System.exit(0);
  }

  /**
 * Main for prompt.
 * @param args recuperation.
 */
  public static void main(String[] args) {
    if (args.length > 0 && args[0].equals("-p")) {
      while (true) {
        System.out.print("[" + args[1] + "] ");
        Scanner readerShell = new Scanner(System.in);
        String cmd = readerShell.nextLine();
        HelloChatBot chatbot = new HelloChatBot();
        chatbot.listen(cmd, args[1]);
      }
    }
  }
}