
IP=`kdialog --title "Host/IP/NombreDominio" --inputbox "Nombre del Host/Dominio o IP"`
mensaje=`kdialog --title "Mensaje" --inputbox "Mensaje a enviar:"`
# Puerto de conexion asignado 31337 

#echo "$mensaje" | nc $IP 31337
echo "$mensaje" | nc $IP 6570





