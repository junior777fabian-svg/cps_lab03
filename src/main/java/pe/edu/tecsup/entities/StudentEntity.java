package pe.edu.tecsup.entities;

public class StudentEntity {
    private Long id;
    private String nombre;
    private String email;

    // Constructor
    public StudentEntity(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Getter básico para que el Controller lo use
    public String getNombre() {
        return nombre;
    }
}