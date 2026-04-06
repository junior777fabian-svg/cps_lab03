package pe.edu.tecsup.services;

import pe.edu.tecsup.entities.StudentEntity;
import pe.edu.tecsup.repositories.StudentRepository;
import java.util.List;

public class StudentService {
    private StudentRepository repository = new StudentRepository();

    public List<StudentEntity> listarAlumnos() {
        return repository.obtenerTodos();
    }
}