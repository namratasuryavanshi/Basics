// Print an array and return sum of the values

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class ArraySum {
 public static void main(String[] args){
   
    System.out.println("Index\tValue");
   int[] arr = new int[10]; 
   int value = 0;
    for(int i = 0; i < arr.length; i++){                   
      arr[i] = (int)(Math.random()*10 + 10);
      System.out.println(i +"\t"+ arr[i]);
      value = arr[i] + value;
      
    }
   System.out.println("Sum of Values:" + value);
  }
}
