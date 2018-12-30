#include <stdio.h>

int opc;
main()
{
printf("1-.MENU A");
printf("2-.MENU B");
printf("3-.MENU C");
printf("\nPresiona una opcion=>");
scanf("%d",&opc);
if (opc==1)
{
printf("SUBMENU A1");
printf("SUBMENU A2");
printf("SUBMENU A3");
}
if (opc==2)
{
printf("SUBMENU B1");
printf("SUBMENU B2");
printf("SUBMENU B3");
}
if (opc==3)
{
printf("SUBMENU C1");
printf("SUBMENU C2");
printf("SUBMENU C3");
}
}
