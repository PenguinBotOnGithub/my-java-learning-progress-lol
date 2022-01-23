public class main {
 public static void main(String[] args) {
  System.out.println("Hooray array!");
  int[] intarr = new int[9999]; // So you can actually declare an array in one line, huh. I wonder if this is a good practice tho
  System.out.println("The length of the 'intarr' array is: " + intarr.length);
  
  System.out.println("Now we make 2 'for loop'");

  for (int i=0; i < intarr.length; i++) { // Surprisingly making a 'for loop' in Java is pretty similar with how you do it in C.
   intarr[i] = i + 1; // Accessing a part of array can be done with 'array[index]'  
  }

  for (int i=0; i < intarr.length; i++) {
   System.out.println("The value of intarr[" + i + "] is: " + intarr[i]);
  } 
 }
}
