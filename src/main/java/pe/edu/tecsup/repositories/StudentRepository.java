package pe.edu.tecsup.repositories;

import pe.edu.tecsup.entities.StudentEntity; // Importante para conectar carpetas
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<StudentEntity> obtenerTodos() {
        List<StudentEntity> alumnos = new ArrayList<>();
        alumnos.add(new StudentEntity(1L, "Junior Fabian", "junior@tecsup.edu.pe"));
        return alumnos;
    }
}