// converting to military time

import java.io.*;
import java.util.*;

public class Solution {
  
  private static int hour, min, sec;
  
  public void setTime(int h, int m, int s){
    hour = ((h>=0 || h<24) ? h : 0);
    min = ((m>=0 || m<60) ? m : 0);
    sec = ((s>=0 || s<60) ? s : 0);
  }
  
  public static String toMilitary(){
    return String.format("%02d:%02d:%02d", hour, min, sec);
  }
  
  public static String tostring(){
    return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour%12), min, sec, (hour < 12 ? "AM" : "PM"));
  }
  
  public static void main(String[] args) {
    
    System.out.println(Solution.toMilitary());
  }
}
