import java.sql.SQLException;

/**
 * Gambito - Esqueleto principal del programa.
 *
 * Este archivo contiene la estructura principal y llamadas a helpers.
 * Los métodos están declarados pero sin implementar: son un ejercicio para el
 * alumno. Cada método lanza `UnsupportedOperationException` o contiene TODOs.
 */
public class Gambito {

    private static DBHelper dbHelper;

    public static void main(String[] args) {
        System.out.println("Gambito - Esqueleto de aplicación");

        dbHelper = new DBHelper();

        try {
            init();
            // TODO: implementar la lógica de la aplicación (CLI/GUI/etc.)
            run();
        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        } finally {
            try {
                dbHelper.close();
            } catch (SQLException ignored) {
            }
        }
    }

    /** Inicializa recursos y la base de datos. */
    private static void init() throws SQLException {
        // TODO: conectar a la BD y crear tablas si es necesario
        throw new UnsupportedOperationException("Implementar init()");
    }

    /** Ejecuta la aplicación (menú, procesamiento, etc.). */
    private static void run() {
        // TODO: implementar la interacción principal del programa
        throw new UnsupportedOperationException("Implementar run()");
    }

    // Métodos auxiliares para la lógica (dejar vacíos / TODOs para el ejercicio):

    /** Inserta un registro de archivo en la BD. */
    public static void insertarRegistro(FileRecord r) throws SQLException {
        throw new UnsupportedOperationException("Implementar insertarRegistro(FileRecord)");
    }

    /** Actualiza un registro existente en la BD. */
    public static void actualizarRegistro(FileRecord r) throws SQLException {
        throw new UnsupportedOperationException("Implementar actualizarRegistro(FileRecord)");
    }

    /** Elimina un registro por id. */
    public static void eliminarRegistro(long id) throws SQLException {
        throw new UnsupportedOperationException("Implementar eliminarRegistro(long)");
    }

    /** Busca registros por criterio. */
    public static java.util.List<FileRecord> buscarRegistros(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Implementar buscarRegistros(String)");
    }

}