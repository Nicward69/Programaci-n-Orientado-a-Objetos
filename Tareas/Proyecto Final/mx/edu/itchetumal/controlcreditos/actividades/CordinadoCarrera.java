package mx.edu.itchetumal.controlcreditos.actividades;
/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */

 import java.util.*;

import javax.swing.JOptionPane;

 class CoordinadorCarrera extends Usuario {
 
     public CoordinadorCarrera(String nombre, String ID) {
         super(nombre, ID, "CoordinadorCarrera");
     }
 
     public List<Alumno> verAlumnosConCreditosCompletos(List<Alumno> listaAlumnos, int creditosRequeridos) {
         List<Alumno> alumnosCompletos = new ArrayList<>();
         for (Alumno alumno : listaAlumnos) {
             if (alumno.verCreditos() >= creditosRequeridos) {
                 alumnosCompletos.add(alumno);
             }
         }
         return alumnosCompletos;
     }
 
     @Override
     public void mostrarMenu() {
        String[] opciones = {"Registrar Acreditación", "Ver Alumnos Inscritos", "Regresar"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menú Docente Responsable",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    
        switch (seleccion) {
            case 0:
                // Código para registrar acreditación
                break;
            case 1:
                // Código para ver alumnos inscritos
                break;
            case 2:
                // Regresar al menú principal
                break;
        }
    }
 }
 