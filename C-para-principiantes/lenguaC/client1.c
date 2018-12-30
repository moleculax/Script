/* client1.c - connect to and disconnect from MySQL server */

#include <my_global.h>
#include <mysql.h>

static char *opt_host_name = NULL;		/* server host (default=localhost) */
static char *opt_user_name = NULL;		/* username (default=login name) */
static char *opt_password = NULL;		/* password (default=none) */
static unsigned int opt_port_num = 0;	/* port number (use built-in value) */
static char *opt_socket_name = NULL;	/* socket name (use built-in value) */
static char *opt_db_name = NULL;		/* database name (default=none) */
static unsigned int opt_flags = 0;		/* connection flags (none) */

static MYSQL *conn;						/* pointer to connection handler */

int
main (int argc, char *argv[])
{
	/* initialize connection handler */
	conn = mysql_init (NULL);
	/* connect to server */
	mysql_real_connect (conn, opt_host_name, opt_user_name, opt_password,
				opt_db_name, opt_port_num, opt_socket_name, opt_flags);
	/* disconnect from server */
	mysql_close (conn);
	exit (0);
}
