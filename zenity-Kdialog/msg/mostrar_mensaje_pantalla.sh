#!/bin/bash
port=6570;
nc -l -p $port | while read mensaje; do zenity --info --text "$mensaje"; done
