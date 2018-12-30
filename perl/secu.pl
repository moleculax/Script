#!/usr/bin/perl –w
# Usa el módulo Data::Dumper
use Data::Dumper;
# En $var1 se almacena el número de secuencias, en $var2 la longitud de la cadena.
print "Introduce el número de secuencias a generar aleatoriamente\n";
$var1 = <STDIN>;
print "Introduce el número de nucleótidos de la secuencia\n";
$var2 = <STDIN>;
# En la función aleatorio se define el arreglo @ns que contiene los nucleotidos,
# $lon es la variable local de la subrutina que guarda el valor del número de
# nucleótidos, $col es la variable local de la subrutina que guarda el valor del
# número de secuencias.
sub aleatorio {
local @ns = (a,g,c,t);
local $lon = $_[1];
local $col = $_[0];
# Se define un arreglo vacio @a en donde se guardaran los vectores.
@a = ();
# Las variables que indican los vectores y las posiciones de sus componentes.
local $i = 0;
local $u = 0;
while ($u <= $col - 1 && $i <= $lon - 1) {
# $result es la variable que guarda la elección aleatoria de cualquiera de los cuatro-
# nucleótidos.
$result = @ns[int(rand(4))];
# De esta manera se adicionan nucleótidos y se generan las cadenas que los contienen.
$a[$u][$i] = $result;
$i = $i + 1;
if ($i == $lon ) {
$u = $u + 1;
$i = 0;
}
}
return @a;
}
# Se muestra en pantalla cada vector y sus componentes.
print Dumper(&aleatorio($var1,$var2));
# Se define las posiciones y los vectores iniciales que se compararan para determinar-
# si tienen nucleótidos idénticos en las mismas posiciones.
$k = 0;
$count = 0;
$s1 = 0;
$s2 = 1;
while ($s1 <= $col - 2 && $s2 <= $col - 1 && $k <= $lon - 1 ) {
# Si los nucleótidos son idénticos $count aumenta una unidad.
if ($a[$s1][$k] eq $a[$s2][$k]) {
$count = $count + 1;
}
# $k indica los nucleótidos en el vector, $s1 y $s2 son los vectores que se comparan.
# Si el valor de $k es igual al número de nucleótidos es un indicativo
# que la comparación entre dos vectores ha finalizado.
$k = $k + 1;
if($k == $lon ) {
$k = 0;
$s2 = $s2 +1;
}
# Si $s2 es igual a $col, indica que uno de los vectores a sido
# comparado completamente con los demás vectores.
if ($s2 == $col ) {
$k = 0;
$s1 = $s1 + 1;
$s2 = $s1 + 1 ;
}

}
# Mediante este bucle se puede determinar el valor de $p que indica
# el número de comparaciones realizadas.
for ($p = $col - 1, $r = $col -2; $r >= 0 ; $r--){
$p += $r;
}
# Se muestran en pantalla los resultados.
print "El numero de nucleotidos identicos es: $count\n";
print "El numero de comparaciones es: $p\n";
$y = $count/$p;
# En la variable $cor se guarda el valor de la fracción promedio de
# nucleótidos idénticos que ocupan la misma posición de la
# comparación de secuencias.
$cor = $y/$lon;
print "La fraccion promedio de los nucleotidos identicos que estan en la misma posicion es: $cor";
