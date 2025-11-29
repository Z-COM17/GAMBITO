-- Esquema de base de datos para Gambito (SQLite)
-- Ejecutar este script para crear las tablas iniciales.

PRAGMA foreign_keys = ON;

CREATE TABLE IF NOT EXISTS file_records (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    path TEXT NOT NULL,
    size INTEGER,
    created_at TEXT,
    modified_at TEXT,
    origin TEXT,
    type TEXT
);

-- Índices sugeridos (opcional):
CREATE INDEX IF NOT EXISTS idx_file_records_name ON file_records(name);
CREATE INDEX IF NOT EXISTS idx_file_records_path ON file_records(path);
