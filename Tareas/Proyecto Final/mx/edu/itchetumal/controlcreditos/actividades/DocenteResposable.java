package mx.edu.itchetumal.controlcreditos.actividades;
/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */

import java.util.*;
import javax.swing.JOptionPane;

 class DocenteResponsable extends Usuario {
     private List<Actividad> listaActividades;
 
    public DocenteResponsable(String nombre, String ID) {
         super(nombre, ID, "DocenteResponsable");
         this.listaActividades = new ArrayList<>();
    }
 
    public void registrarAcreditacion(Alumno alumno, Actividad actividad, boolean acreditado) {
         if (acreditado && listaActividades.contains(actividad)) {
             try {
                 alumno.inscribirActividad(actividad);
             } catch (Exception e) {
                 System.out.println("Error al inscribir actividad: " + e.getMessage());
             }
         }
    }
 
    public List<Alumno> verAlumnos(Actividad actividad) {
         return actividad.getListaAlumnos();
    }
 
     @Override
     
     
    public void mostrarMenu() {
        String[] opciones = {"Ver Alumnos con Créditos Completos", "Regresar"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menú Coordinador de Carrera",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    
        switch (seleccion) {
            case 0:
                // Código para ver alumnos con créditos completos
                break;
            case 1:
                // Regresar al menú principal
                break;
        }
    }
 }
 