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

Original notes:

// Esto va a ser una AI que organiza mis archivos de forma automatica,
// estudiando mis compotamientos y patrones de uso.

/* _ Criterios que considera:
  1. Nombre del archivo.
  2. Palabras, imagenes o numeros poco comunes,
  repetidos en varios archivos (los, la , hola, y, titulo y  demas,
  quedan descartados al ver que estan tambien repetidos en todos los archivos 
  y no se pueden usar como criterio).
  3. Fecha de creacion, descarga y ultima modificacion.
  4. Origen del archivo (pagina web, aplicacion, dispositivo).
  5. Tipo de archivo (documento, imagen, video, audio, comprimido, ejecutable).
  6. uso frecuente o reciente del archivo.
*/

/*Cualidades que debe tener:
  1. Rapidez: que actue sore la marcha sin esperar, 
  tomando poco riesgo al principio y aumentando sus apuestas al entender mejor los comportamientos del usuario.
  2. Autonomo: que no me pregunte por cualquier cambio que haga.
  3. Personalizacion: que sea al gusto de todo el mundo, pudiendo personalizar el detalle de las categorias, el nivel de autonomia y mas.
  4. Seguridad y privacidad: de codigo abierto, sin recoleccion de datos en la nube y eliminaion de los metadatos de los archivos vistos o tocados por el programa.
  5. Reversible: que tenga copias de seguridad y registros de cambios para poder deshacer cualquier cambio realizado.
 */

/*_ingenieria usada:
  1. Sistema de puntos con peso de prioridad para cada criterio.
  2. Memoria de forma local y temporal, con esquemas y nombres "no los archivos completos" para no saturar el sistema.
  3. Profundidad de ramificacion de categorias personalizable.
  4. JAVA + SQLite para la base de datos ligera y rapida.
*/
