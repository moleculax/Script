#!/bin/bash
#su desarrollo
var_fecha=$(date +"%Y-%m-%d-%H-%M")
var_respaldo="siagesdb$var_fecha.tar"

export PGUSER=root
export PGPASSWORD=sisg

pg_dump  siagdb > siag.sql
tar -cvf "$var_respaldo" siagesdb.sql
mv "$var_respaldo" /home/desarrollo/
