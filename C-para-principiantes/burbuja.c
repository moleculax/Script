#include <stdio.h>
#include <string.h>
#include <stdlib.h>

main()
{
int vec[1000000], *ptr_i, *ptr_j,tmp;
int i,n,j,bandera=0;
ptr_i=vec;
printf("Cuantos numeros: ");
scanf("%d",&n);
for(i=0;i<n;i++)
{
  printf("\nDame el numero [%d]: ",i+1);
  scanf("%d",ptr_i);
  *ptr_i++;
}
ptr_i=vec;

for(i=0;i<n;i++)
{
  bandera=0;
  ptr_j=ptr_i;
  for(j=i;j<n;j++)
  {
   if(*ptr_i>*ptr_j)
   {
   tmp=*ptr_i;
   *ptr_i=*ptr_j;
   *ptr_j=tmp;
   bandera=1;
   }
   *ptr_j++;
  }
  *ptr_i++;
  if(bandera==0)
   break;
}

for(i=0;i<n;i++)
{
  printf("\n[%d]: %d",i+1,vec[i]);
}
   printf("\n ");
  
}