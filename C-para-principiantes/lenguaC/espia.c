
#include <stdlib.h>

void imprimeVariable( char *lpzNombre );

int main(){      
/* *********************************** */

   printf("Content-Type: text/html\n\n");

   printf("<html><body bgcolor=#ffffff text=#ffffff>\n");

   printf("<p align=center><table cellpadding=4 bgcolor=000000>\n");
   printf("<tr><td color=000080 align=center>");
   printf("<b>Variables del Sistema</b></td></tr>\n");


// El programa de ejemplo que Ud. puede bajar incluye mas
// llamadas a estas funciones

   imprimeVariable("REMOTE_ADDR");
   imprimeVariable("REMOTE_HOST");

   printf("</table>\n");
   printf("</body></html>");

   return( 0 );
}


void imprimeVariable( char *lpzNombre ){
/* *********************************** */

 printf("<tr>\n");
 printf("<td bgcolor=\"#9999FF\" valign=top>%s</td>\n",lpzNombre);
 printf("<td bgcolor=\"#DDDDFF\" valign=top><font color=#000000>");

 printf("%s",getenv(lpzNombre));

 printf("</td>\n");
 printf("</tr>\n");

}

