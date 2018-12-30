/* 82_union.c */
#include <stdio.h>
union u_emp
{
      int eno;
      char name[20];
      float sal;
};
int main()
{
      union u_emp ue;
      printf("Enter Employee Number  : "); scanf("%d", &ue.eno);
      printf("Enter Employee Name   : "); scanf("%s", ue.name);
      printf("Enter Employee Salary  : "); scanf("%f", &ue.sal);
      printf("\n\nEmployee Details are as follows...\n");
      printf("%d %s %f ", ue.eno, ue.name, ue.sal);
      return 0;
}
