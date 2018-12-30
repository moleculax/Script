#Solucion problema de arranque Mysql
chown -R mysql /var/lib/mysql
mysql_install_db
/etc/init.d/mysql restart
/etc/init.d/apache2 restart
