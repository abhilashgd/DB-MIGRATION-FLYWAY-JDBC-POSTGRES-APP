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



//Flyway Documentation
https://flywaydb.org/documentation/
https://flywaydb.org/documentation/concepts/migrations

//POSTMAN:



POST: http://localhost:8080/api/v1/movies
JSON-RAW:

{
"name":  "Finch",
"releaseDate": "2020-01-01"
}
{
"name":  "spider man",
"releaseDate": "2021-06-01"
}

GET: http://localhost:8080/api/v1/movies //to fetch the list of movies with list limit 100
GET: http://localhost:8080/api/v1/movies/1 //to get by id
DELETE: http://localhost:8080/api/v1/movies/1 //to delete by id
//Other Info:
//Java Records introduced in java -14
https://docs.oracle.com/en/java/javase/14/language/records.html
https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html
//for jdbi 3 Template Documentation https://jdbi.org/
