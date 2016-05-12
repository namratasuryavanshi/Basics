// Variable length arguments

import java.io.*;
import java.util.*;
import java.lang.*;

class VariableArgs {
  public static void main(String[] args){
    
    System.out.println("Average is: "+ avg(5,3,2,5,7,3,1,4,4));
    
  }
  // int...number - unsure about number of arguments to be passed to the menthod
  public static int avg(int...number){
    int total = 0;
    for(int x: number){
      total += x;
    }
    return total/number.length; // number.length = how many values
  }
}

/* OUTPUT

Average is: 3 
*/
