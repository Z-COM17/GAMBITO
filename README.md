# Gambito 


Main files progress:

- `Gambito.java`: Main class with the application structure. Contains methods
  declared but not implemented (`TODO` / `UnsupportedOperationException`).
- `DBHelper.java`: Database helper — method signatures for connecting,
  creating tables and CRUD operations; these functions are left as an exercise.
- `FileRecord.java`: Data structure to represent a file/record.
- `schema.sql`: SQL script (SQLite) with the required tables.

Current goals:
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

# Original notes (English version below):

Esto va a ser una AI que organiza mis archivos de forma automatica,
estudiando mis compotamientos y patrones de uso.

 - Criterios que considera:
    1. Nombre del archivo.
    2. Palabras, imagenes o numeros poco comunes,
    repetidos en varios archivos (los, la , hola, y, titulo y  demas,
    quedan descartados al ver que estan tambien repetidos en todos los archivos 
    y no se pueden usar como criterio).
    3. Fecha de creacion, descarga y ultima modificacion.
    4. Origen del archivo (pagina web, aplicacion, dispositivo).
    5. Tipo de archivo (documento, imagen, video, audio, comprimido, ejecutable).
    6. uso frecuente o reciente del archivo.


 - Cualidades que debe tener:
    1. Rapidez: que actue sore la marcha sin esperar, 
    tomando poco riesgo al principio y aumentando sus apuestas al entender mejor los comportamientos del usuario.
    2. Autonomo: que no me pregunte por cualquier cambio que haga.
    3. Personalizacion: que sea al gusto de todo el mundo, pudiendo personalizar el detalle de las categorias, el nivel de autonomia y mas.
    4. Seguridad y privacidad: de codigo abierto, sin recoleccion de datos en la nube y eliminaion de los metadatos de los archivos vistos o tocados por el programa.
    5. Reversible: que tenga copias de seguridad y registros de cambios para poder deshacer cualquier cambio realizado.
 
 - ingenieria usada:
    1. Sistema de puntos con peso de prioridad para cada criterio.
    2. Memoria de forma local y temporal, con esquemas y nombres "no los archivos completos" para no saturar el sistema.
    3. Profundidad de ramificacion de categorias personalizable.
    4. JAVA + SQLite para la base de datos ligera y rapida.


# English version:

Warning !: THis was literally traduced from spanish, so some senteces may be hard to understand, sorry I don't want to use AI for this :/

This'll be an AI that organises your Files and Documents automatically, 
studying your usage paterns and your files dragging.

 - Usage criteria:
    1. The file name.
    2. Infile words, images or commun numbers, repeted in specific files various times, 
    common words like (the, hello, a, as, etc) will be ignored since it'll see they're not exclusive to a specific selection and can't be used to create a category.
    3. Download, modification and creation date.
    4. The file or directory origin (web page, app, the sender's device name or the mail address).
    5. The file type(Document, image, video, audio, etc).
    6. The frecuent or recent usage.

 - "Must" options:
    1. Speed and efficiency: acts immidiatlly after the installation, taking low risks at the beggining and raising it's bets after getting enough user and preferences info. 
    2. Autonomous: Doesn't saturate the user with popup windows asking for every step "that's a huge no".
    3. Personalization: Can be adapted to the taste of everybody.
    4. Security and privacy: Open source code, without cloud storage, removes the metadata from the seen or edited file.
    5. Reversible: backup data base to reverse all of the AI changes.
 
 - Used tecnogies:
    1. Score system, making the files location changing easier to evaluate.
    2. Local and temporal memory storage, using shemas and names "not the actual files" to save storage and time.
    3. JAVA + SQLite for data base, shema and backup storage.


