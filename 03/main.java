public class main {
 public static void main(String[] args) {
  String l = "Hello";
  System.out.println("The 'l' string variable should have a value of 'Hello'");
  if (l == "Hello") {
   String total = l + "World!";
   System.out.println(total);
  }
  else {
   System.out.println("Guess you did not pass 'Hello' as an argument");
  } 
 }
}
