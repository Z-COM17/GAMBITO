# Gambito — Project Skeleton

This repository contains a Java skeleton and a SQL schema so you can practice
implementing the application logic and database operations.

Main files:

- `Gambito.java`: Main class with the application structure. Contains methods
  declared but not implemented (`TODO` / `UnsupportedOperationException`).
- `DBHelper.java`: Database helper — method signatures for connecting,
  creating tables and CRUD operations; these functions are left as an exercise.
- `FileRecord.java`: Data structure to represent a file/record.
- `schema.sql`: SQL script (SQLite) with the required tables.

Exercise goals
- Implement the functions in `DBHelper` to open/close the connection,
  execute `CREATE TABLE` (use `schema.sql`) and perform `INSERT`, `UPDATE`,
  `DELETE` and `SELECT` operations.
- Complete the methods in `Gambito.java` so the application initializes the DB,
  provides a simple menu and allows inserting/querying records.

Compile and run (example):

```bash
javac *.java
java Gambito
```

Notes:
- The example uses SQLite by default (`jdbc:sqlite:gambito.db`). If you use a
  different database, adjust `DBHelper.DB_URL` and the corresponding JDBC driver.
- Leave the methods unimplemented as your exercise. If you want, I can help
  implement one or two methods and create tests.
