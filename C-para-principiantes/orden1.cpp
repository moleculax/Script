#include <conio.h>
#include <stdio.h>
#include <iostream>
using namespace std;

main()
{
int n, i, j, A[50], aux;

cout<<"Ingrese la Cantidad de Nuemeros a Ingresar: "; 
cin >> n;
//LLENA EL VECTOR
for(i=1;i<=n;i++)
{
cout<<"Vector Numero "<<i<<" :";
cin>>A[i];
}
//REALIZA LA ORDENACION
for(i=1;i<=n-1;i++)
{
for(j=1;j<=n-1;j++)
{
if(A[j]>A[j+1])
{
aux=A[j];
A[j]=A[j+1];
A[j+1]=aux;
}
}
}
//IMPRIME LOS DATOS ORDENADOS
cout << "ascendente: ";
for(i=1;i<=n;i++)
{
cout<<","<<A[i];
}
cout << "\ndecendente: ";
for(i=n;i>=1;i--)
{
cout<<","<<A[i];
}
getch();
}
