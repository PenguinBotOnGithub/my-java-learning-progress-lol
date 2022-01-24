public class main {
 public static void main(String[] args) {
  System.out.println("A do-while loop :flushed:");
  int i = 0;
  do {
   System.out.println("Super Idol的笑容 都没你的甜 八月正午的阳光 都没你耀眼 热爱 105 °C的你 滴滴清纯的蒸馏水");
   i++;
  } while (i < 106);

  System.out.println("A while loop");
  i = 0;
  while (i<5) {
   System.out.println("deez");
   i++;
  }
  
  System.out.println("break and continue do-while loop test");
  i = 0;
  do {
   i++; 
   if (i >= 20) {
     System.out.println("wow");
     break;  
   } 
   if (i <= 10) {
    System.out.println("woah");
    continue;
   }
   System.out.println(i);
  } while (i > -1);
 }
}
