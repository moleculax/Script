#!/bin/bash
echo "1" > /proc/sys/net/ipv4/ip_forward
iptables -F
iptables -t nat -A PREROUTING -p tcp -i eth0  --dport 80 -j DNAT --to-destination  10.10.1.1:80
