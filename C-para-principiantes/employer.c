/* 10_emp.c */
#include <stdio.h>
int main()
{
     int eno; 
     char name[10]; /* name with 10 characters width */
     float sal, asal; /* sal & asal as real values */
     printf("Enter cedula  empleado "); scanf("%d", &eno);
     printf("Enter nombre empleado "); scanf("%s", name);
     printf("Enter salario empleado "); scanf("%f", &sal); 

     asal = sal * 12;
     printf("\n cedula %d", eno);
     printf("\n nombre %s", name);
     printf("\n salario %f", sal);
     printf("\n salario anual %f", asal);
     printf("\n");
     return 0;
}
