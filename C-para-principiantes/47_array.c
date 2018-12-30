/* 47_arrays.c */
#include <stdio.h>
int main()
{
     int age[4], i;
     
     for( i=0; i<4; i++)
     {
          printf("Enter an age");
	scanf("%d", &age[i]);
     }

     for(i=0; i<4; i++)
          printf("\nYou entered %d", age[i]);
     
     return 0;
}
