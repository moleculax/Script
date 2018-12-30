#!/bin/bash

case "$1" in
   start)
      echo "Iniciando nombre_servicio... "
	# Comando que inicializa el servicio
       ifconfig eth0:1 10.10.1.1 netmask 255.255.255.0 
      ;;

    stop)
      echo "Parando nombre_servicio... "
       # Comando que detiene el servicio
	ifconfig eth0:1 down
       ;;
    restart)
      echo "Reiniciando nombre_servicio... "
       # Comando que reinicia el servicio
	ifconfig eth0:1 10.10.1.1 netmask 255.255.255.0
       ;;
    # Otras opciones posibles aceptadas (diferentes para cada servicio) como:
    # status: Daría información sobre el estado del servicio
    # reload: Enviaría una señal al proceso para releer la configuración
    *)
       echo "Use $0 {start|stop|restart|(otras opciones)}"
       ;;
esac
exit 0 
