/**
 * FileRecord - data structure to represent a file/record.
 *
 * Public fields are exposed to simplify the exercise; you can create
 * getters/setters if you prefer (leave them unimplemented as an exercise).
 */
public class FileRecord {
    public Long id; // identifier (may be null before insert)
    public String name;
    public String path;
    public Long size;
    public String createdAt; // ISO-8601 or chosen format
    public String modifiedAt;
    public String origin; // origin (e.g., "web", "download", "camera")
    public String type;   // MIME type or description

    // Empty constructor (you can add parameterized constructors as an exercise)
    public FileRecord() {
    }

    // NOTE: Leave additional methods as an exercise (getters/setters, validations, etc.)
}
