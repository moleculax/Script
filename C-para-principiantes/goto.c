/* 20_goto.c */ 
#include <stdio.h>
int main()
{
     int i = 1;
     abc:
          printf("\nHolaaa");
          i ++;
          if ( i<= 10 )	 
     goto abc;
     return 0; 
}
