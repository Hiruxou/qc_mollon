package com.chatbot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ChatBot {

  /**
   * Distribute.
   * @param str for respons.
   */
  public void listen(String str, String name) {
    if (str.equals("@hello")) {
      hello(str, name);
    }
    if (str.equals("++")) {
      exit();
    }    
  }

  private void hello(String str, String name) {
    String pattern = "'Nous sommes ' EEEEE dd MMMMM 'et il est' HH'h'mm'.'";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());
    System.out.println("[hello] Salut [" + name + "]!" + " " + date);
  }

  private void exit() {
    System.exit(-1);
  }

  /**
 * Main for prompt.
 * @param args recuperation.
 */
  public static void main(String[] args) {
    while (true) {
      if (args.length > 0 && args[0].equals("-p")) {
        System.out.print("[" + args[1] + "] ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ChatBot chatbot = new ChatBot();
        chatbot.listen(str, args[1]);
      }
    }
  }
}