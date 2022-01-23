#include <stdio.h>

int main() {
 int intarr[9999];

 int size = sizeof intarr / sizeof intarr[0]; /* Using a compiler extension to calculate the length of an array mfw */

 /*printf("%d", size);*/

 int i;

 for (i=0; i <= size; i++) {
  intarr[i] = i + 1;
 }

 for (i=0; i <= size; i++) {
  printf("The value of intarr[%d] is: %d\n", i, i);
 } 
}
