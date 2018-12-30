#include <stdio.h>
#include <stdlib.h>
#define SIZE 11
 
 
int main( void )
{  
 
   int a[ SIZE ] = { 2, 6, 4, 8, 100, 12, 89, 68, 45, 37, 1 };
   int pass;
   int i;  
   int hold;
   
   printf( "Orden original de los datos\n" );
   
   
   for ( i = 0; i < SIZE; i++ ) {
      printf( "%4d", a[ i ] );
   }
 
   
  for ( pass = 1; pass < SIZE; pass++ ) {
 
     
     for ( i = 0; i < SIZE - 1; i++ ) {      
 
         
         if ( a[ i ] > a[ i + 1 ] ) {  
            hold = a[ i ];                  
            a[ i ] = a[ i + 1 ];
            a[ i + 1 ] = hold;
         }
 
      }
 
    }
 
   printf( "\nDatos ordenados ascendentemente\n" );
 
   
   for ( i = 0; i < SIZE; i++ ) {
      printf( "%4d", a[ i ] );
   }
 
   printf( "\n" );
/*system("PAUSE");*/
   return 0;
 
}
