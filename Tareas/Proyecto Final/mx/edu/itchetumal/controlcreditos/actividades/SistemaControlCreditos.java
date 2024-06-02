package mx.edu.itchetumal.controlcreditos.actividades;
/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */

import java.nio.file.Files;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class SistemaControlCreditos {

    private List<Alumno> listaAlumnos;
    private List<DocenteResponsable> listaDocentesResponsables;
    private List<CoordinadorCarrera> listaCoordinadoresCarrera;
    private List<Actividad> listaActividades;

    public SistemaControlCreditos() {
        listaAlumnos = new ArrayList<>();
        listaActividades = new ArrayList<>();
    }

    public void cargarDatos() {
        // Implementación de la carga de datos desde archivos
    }

    public void guardarDatos() {
        // Implementación del guardado de datos en archivos
    }

    public void procesarCreditos() {
        // Implementación del proceso de conteo de créditos por alumno
    }

    private void mostrarMenuPrincipal() {
        String[] opciones = {"Alumno", "Docente Responsable", "Coordinador de Carrera", "Registrar Docente", "Registrar Coordinador", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione su tipo de usuario",
                "Sistema de Control de Créditos Complementarios",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    
        switch (seleccion) {
            case 0:
                mostrarMenuAlumno();
                break;
            case 1:
                mostrarMenuDocente();
                break;
            case 2:
                mostrarMenuCoordinador();
                break;
            case 3:
                registrarDocente(); // Llamada al método registrarDocente()
                break;
            case 4:
                registrarCoordinador(); // Llamada al método registrarCoordinador()
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    private void mostrarMenuAlumno() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String ID = JOptionPane.showInputDialog("Ingrese su ID:");
        Alumno alumno = new Alumno(nombre, ID);
        listaAlumnos.add(alumno);
        
        String[] opciones = {"Inscribir Actividad", "Ver Créditos", "Ver Actividades", "Subir Evidencia", "Regresar"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Menú Alumno",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0:
                    inscribirActividadAlumno(alumno);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Total de créditos: " + alumno.verCreditos());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Actividades acreditadas: " + alumno.verActividades());
                    break;
                case 3:
                    subirEvidencia(alumno);
                    break;
                case 4:
                    mostrarMenuPrincipal();
                    return;
            }
        }
    }

    private void registrarDocente() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String ID = JOptionPane.showInputDialog("Ingrese su ID:");
        DocenteResponsable docente = new DocenteResponsable(nombre, ID);
        listaDocentesResponsables.add(docente);
        // Realiza cualquier otra operación necesaria
    }

    private void registrarCoordinador() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String ID = JOptionPane.showInputDialog("Ingrese su ID:");
        CoordinadorCarrera coordinador = new CoordinadorCarrera(nombre, ID);
        listaCoordinadoresCarrera.add(coordinador);
        // Realiza cualquier otra operación necesaria
    }

    private void inscribirActividadAlumno(Alumno alumno) {
        String nombreActividad = JOptionPane.showInputDialog("Ingrese el nombre de la actividad:");
        Actividad actividad = buscarActividad(nombreActividad);
        if (actividad != null) {
            try {
                alumno.inscribirActividad(actividad);
                JOptionPane.showMessageDialog(null, "Inscripción exitosa.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Actividad no encontrada.");
        }
    }

    private Actividad buscarActividad(String nombre) {
        for (Actividad actividad : listaActividades) {
            if (actividad.getNombre().equalsIgnoreCase(nombre)) {
                return actividad;
            }
        }
        return null;
    }

    private void subirEvidencia(Alumno alumno) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            File destino = new File("evidencias/" + alumno.getID());
            destino.mkdirs();
            File nuevoArchivo = new File(destino, archivo.getName());
            try {
                Files.copy(archivo.toPath(), nuevoArchivo.toPath());
                JOptionPane.showMessageDialog(null, "Evidencia subida exitosamente.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al subir la evidencia: " + e.getMessage());
            }
        }
    }

    private void mostrarMenuDocente() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String ID = JOptionPane.showInputDialog("Ingrese su ID:");
        DocenteResponsable docente = new DocenteResponsable(nombre, ID);
        
        docente.mostrarMenu();
    }

    private void mostrarMenuCoordinador() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String ID = JOptionPane.showInputDialog("Ingrese su ID:");
        CoordinadorCarrera coordinador = new CoordinadorCarrera(nombre, ID);
        
        coordinador.mostrarMenu();
    }

    public static void main(String[] args) {
        SistemaControlCreditos sistema = new SistemaControlCreditos();
        sistema.mostrarMenuPrincipal();
    }
}
