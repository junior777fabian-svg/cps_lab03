package pe.edu.tecsup.controllers;

import pe.edu.tecsup.services.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public void imprimirAlumnos() {
        service.listarAlumnos().forEach(alumno -> {
            System.out.println("Estudiante: " + alumno.getNombre());
        });
    }
}