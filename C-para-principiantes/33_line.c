/* 33_line.c */
#include <stdio.h>
void line();	      /* Declaration */
int main()
{
     line();	      /* Function call */
     return 0;
}
void line()	      /* Definition */
{
     int i;
     for(i =1;i<8; i++)
        printf("*");
	printf("\n");
}
