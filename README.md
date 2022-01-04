# JDBC-CONNECTIONPOOL-HIKARICP-FLYWAY-POSTGRES-APP
DB Migration

Working with Database

—>JDBC, JDBC template,
—>SQL,
—>Connection pool, transactions, RowMappers

// Database Migration Tools
FLYWAY and LIQUIBASE

Data Source provides a way to obtain a DBMS connection

HikariCP & Tomcat CP


//Docker Commands. inside the application folder run
% Docker compose up
% docker exec -it 48007cff6b6e /bin/bash
% psql -U abhilashgd
abhilashgd=# \l
abhilashgd=# \c abhilashgd //to connect to abhilashgd database
abhilashgd=# select * from movie; // displays below
id | name | release_date
----+------+--------------
(0 rows)


//accessing DB from browser using pgadmin
http://localhost:5050
set master password {example- password}


//Other Info:
//Java Records introduced in java -14
https://docs.oracle.com/en/java/javase/14/language/records.html

//Flyway Documentation
https://flywaydb.org/documentation/
https://flywaydb.org/documentation/concepts/migrations

