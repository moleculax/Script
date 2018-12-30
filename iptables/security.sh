#!/bin/sh
iptables -F
#cerrando puertos ftp y ssh
iptables -A INPUT -p tcp --dport 21:22 -j DROP

#Bloquear paginas
iptables  -A INPUT -s www.facebook.com -j DROP
iptables -A INPUT -s www.yahoo.com -j DROP
iptables -A INPUT -s www.twitter.com -j DROP
