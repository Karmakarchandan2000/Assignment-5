package com.EdyodaAssignment.Assignment5;

class CompareElementsInACollection {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(5,7,9,14,18);
           
        int min = Collections.min(list);
  
        int max = Collections.max(list);
  
        if (min == max) {
            System.out.println("Same Elements");
        }
        else {
            System.out.println("Minimum value of the list : " + min);
            System.out.println("Maximum value of the list : " + max);
        }
    }
}


