
 
package com.EdyodaAssignment.Assignment5;

import java.util.*;
 
pubic class BinaryToOctal {
 
    
    public static void octalNo(String s)
    {
         if (s.length() % 3 == 1) {
             s = "00" + s;
        }
        else if (s.length() % 3 == 2) {
             s = "0" + s;
        }
        HashMap<String, Integer> BTO = new HashMap<>();
 
        BTO.put("0", 0);
        BTO.put("1", 1);
        BTO.put("10", 2);
        BTO.put("11", 3);
        BTO.put("100", 4);
        BTO.put("101", 5);
        BTO.put("110", 6);
        BTO.put("111", 7);
 
        String[] part = new String[3];
        int t = 0;
         for (int i = 0; i < s.length(); i = i + 3) {
             String bypart = s.substring(i, i + 3);
            part[t] = bypart;
            
            if (BTO.containsKey(part[t])) {
                 System.out.print(BTO.get(part[t]));
            }
             t++;
        }
    }
     public static void main(String[] args)
    {
         System.out.print("Enter a binary number: ");
         String s = 11;
       
        octalNo(s);
       
        System.out.print("Octal number : ");
    }
}