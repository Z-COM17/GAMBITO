import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * DBHelper - Helper class for database management.
 *
 * This file defines the methods the application will use to connect,
 * create tables and perform CRUD operations. All methods are left
 * unimplemented (throw UnsupportedOperationException) so they can
 * be an exercise for the student.
 */
public class DBHelper {

    // URL de conexión (ejemplo para SQLite local); modificar según necesidad
    public static final String DB_URL = "jdbc:sqlite:gambito.db";

    public DBHelper() {
        // Empty constructor (optional: initialize configuration)
    }

    /** Opens and returns a database connection. */
    public Connection connect() throws SQLException {
        throw new UnsupportedOperationException("Implement connect() to open DB connection");
    }

    /** Closes the connection and releases resources. */
    public void close() throws SQLException {
        throw new UnsupportedOperationException("Implement close() to close the connection and resources");
    }

    /** Creates the necessary tables in the database (if not exists). */
    public void createTables() throws SQLException {
        throw new UnsupportedOperationException("Implement createTables() with CREATE TABLE statements");
    }

    /** Inserts a file record into the DB. */
    public void insertFileRecord(FileRecord r) throws SQLException {
        throw new UnsupportedOperationException("Implement insertFileRecord(FileRecord)");
    }

    /** Updates an existing record. */
    public void updateFileRecord(FileRecord r) throws SQLException {
        throw new UnsupportedOperationException("Implement updateFileRecord(FileRecord)");
    }

    /** Deletes a record by id. */
    public void deleteFileRecord(long id) throws SQLException {
        throw new UnsupportedOperationException("Implement deleteFileRecord(long)");
    }

    /** Queries records by criteria and returns a list (empty if none). */
    public List<FileRecord> queryFileRecords(String criteria) throws SQLException {
        throw new UnsupportedOperationException("Implement queryFileRecords(String)");
    }

}
