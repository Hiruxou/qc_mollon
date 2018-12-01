package com.github;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDate {

  /**
     * have date with good format.
     * @return current date.
    */
  public String currentDateFormat() {
    String datePattern = "EEEEE dd MMMMM";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
    String currentDate = simpleDateFormat.format(new Date());
    return currentDate;
  }

  /**
   * Have time with good format.
   * @return current time.
   */
  public String currentTimeFormat() {
    String timePattern = "HH'h'mm";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timePattern);
    String currentTime = simpleDateFormat.format(new Date());
    return currentTime;
  }
}