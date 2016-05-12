// Random roll on a dice and out their frequency on a 1000 time roll

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class DiceRoll {
 public static void main(String[] args){
   Random dice = new Random();
   int[] freq = new int[7]; 
   
    for(int roll = 0; roll < 1000; roll++){
      ++freq[1 + dice.nextInt(6)];    
    }
   System.out.println("Face\tFrquency");
   
   for(int face = 1; face < freq.length; face++){
     System.out.println(face+"\t"+freq[face]);
   }
  }
}


/*OUTPUT

Face    Frquency 
1       168 
2       166 
3       168 
4       161 
5       169 
6       168 

*/
