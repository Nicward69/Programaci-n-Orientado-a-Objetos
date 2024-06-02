package mx.edu.itchetumal.controlcreditos.actividades;
/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */

import javax.swing.JFileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import javax.swing.*;

class Alumno extends Usuario {
    private int creditosTotales;
    private List<Actividad> listaActividades;

    public Alumno(String nombre, String ID) {
        super(nombre, ID, "Alumno");
        this.creditosTotales = 0;
        this.listaActividades = new ArrayList<>();
    }

    public void inscribirActividad(Actividad actividad) throws Exception {
        if (actividad.inscribirAlumno(this)) {
            listaActividades.add(actividad);
            actualizarCreditos();
        }
    }

    public void actualizarCreditos() {
        Map<String, Integer> creditosPorCategoria = new HashMap<>();
        for (Actividad actividad : listaActividades) {
            creditosPorCategoria.putIfAbsent(actividad.getTipo(), 0);
            int creditosAcumulados = creditosPorCategoria.get(actividad.getTipo());
            int creditosActividad = actividad.getCreditos();
            if (creditosAcumulados < 2) {
                int creditosAAgregar = Math.min(creditosActividad, 2 - creditosAcumulados);
                creditosPorCategoria.put(actividad.getTipo(), creditosAcumulados + creditosAAgregar);
            }
        }
        creditosTotales = creditosPorCategoria.values().stream().mapToInt(Integer::intValue).sum();
    }

    public int verCreditos() {
        return creditosTotales;
    }

    public List<Actividad> verActividades() {
        return listaActividades;
    }

    @Override
    public void mostrarMenu() {
        // Implementación del menú para el alumno
    }

    public void subirEvidencia() {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            File destino = new File("evidencias/" + this.ID);
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
}
