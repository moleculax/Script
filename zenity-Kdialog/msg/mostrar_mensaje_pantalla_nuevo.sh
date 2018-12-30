#!/bin/bash
port=6570

while true; do
nc -l -p $port | while read mensaje; do zenity --info --text "$mensaje"; done
done
