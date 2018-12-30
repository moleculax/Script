#!/usr/bin/python

import pg

conn = pg.connect(dbname='baseDatos',user='usuario',passwd='clave')

consulta = 'select * from tabla;'
resultado = conn.query(consulta)

conn.close()

print resultado
