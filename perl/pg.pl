#!/usr/bin/perl
use strict;
use Gtk2 '-init';
use Gtk2::GladeXML;

my($programa, $ventana_principal, $vetana_fecha, $calendario, $etiqueta_para_escribir_fecha);

$programa = Gtk2::GladeXML->new('prueba.glade');

### Cargo Widgets
$ventana_principal = $programa->get_widget('ventana_principal');
$calendario = $programa->get_widget('calendario');
$vetana_fecha = $programa->get_widget('ventana_fecha');
$etiqueta_para_escribir_fecha = $programa->get_widget('etiqueta_para_escribir_fecha');

$programa->signal_autoconnect_from_package('main');

Gtk2->main;

sub on_boton_averiguar_fecha_clicked {
	my($ano, $mes, $dia) = $calendario->get_date;
	$etiqueta_para_escribir_fecha->set_markup("El año que seleccionaste fue: $ano
El mes que seleccionaste fue: $mes\n El día que seleccionaste fue: $dia");
	$vetana_fecha->show_all;
}
sub on_ventana_fecha_boton_aceptar_clicked {$vetana_fecha->hide;}
sub on_boton_salir_clicked {Gtk2->main_quit;}
