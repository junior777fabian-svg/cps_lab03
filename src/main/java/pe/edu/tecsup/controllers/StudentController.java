package pe.edu.tecsup.controllers;

import pe.edu.tecsup.services.StudentService;
import pe.edu.tecsup.entities.StudentEntity;
import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();

    // --- CAMBIO DEL RESPONSABLE (SPRINT-2) ---
    public void imprimirReporteEstudiantes() {
        System.out.println("========================================");
        System.out.println("   REPORTE DE ESTUDIANTES - TECSUP      ");
        System.out.println("========================================");

        List<StudentEntity> lista = studentService.listarAlumnos();

        for (StudentEntity alumno : lista) {
            System.out.println("Nombre: " + alumno.getNombre());
            // Si tu compañero agregó 'apellido' o 'email', aquí podrías imprimirlo
        }

        System.out.println("Total de registros: " + lista.size());
    }

    public void saludar() {
        System.out.println("Controlador iniciado con éxito.");
    }
}