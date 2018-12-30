#!/bin/bash

# Dispositivo de red de internet
EXIF='eth0'

# Dispositivo de red local
INIF='eth0:1'

iptables --flush
iptables -A INPUT -i $INIF -j ACCEPT
iptables -t nat -A POSTROUTING -o $EXIF -j MASQUERADE

# Aceptar paquetes para reenviar procedentes de internet de conexiones ya establecidas

iptables -A FORWARD -i $INIF -o $EXIF -j ACCEPT
iptables -A FORWARD -i $EXIF -o $INIF -m state --state RELATED,ESTABLISHED -j ACCEPT
iptables -A FORWARD -i $INIF -j ACCEPT
iptables -P OUTPUT ACCEPT

echo 1 > /proc/sys/net/ipv4/ip_forward





