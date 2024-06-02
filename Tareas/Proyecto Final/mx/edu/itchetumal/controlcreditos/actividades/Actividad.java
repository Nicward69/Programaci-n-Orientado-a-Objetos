/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */
package mx.edu.itchetumal.controlcreditos.actividades;
 import java.util.*;

 abstract class Actividad {
     protected String nombre;
     protected String fecha;
     protected String organizador;
     protected String responsable;
     protected int creditos;
     protected int limiteInscripciones;
     protected String tipo;
     protected List<Alumno> listaAlumnos;
 
     public Actividad(String nombre, String fecha, String organizador, String responsable, int creditos, int limiteInscripciones, String tipo) {
         this.nombre = nombre;
         this.fecha = fecha;
         this.organizador = organizador;
         this.responsable = responsable;
         this.creditos = creditos;
         this.limiteInscripciones = limiteInscripciones;
         this.tipo = tipo;
         this.listaAlumnos = new ArrayList<>();
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public String getFecha() {
         return fecha;
     }
 
     public String getOrganizador() {
         return organizador;
     }
 
     public String getResponsable() {
         return responsable;
     }
 
     public int getCreditos() {
         return creditos;
     }
 
     public String getTipo() {
         return tipo;
     }
 
     public List<Alumno> getListaAlumnos() {
         return listaAlumnos;
     }
 
     public boolean inscribirAlumno(Alumno alumno) throws Exception {
         if (listaAlumnos.size() < limiteInscripciones) {
             listaAlumnos.add(alumno);
             return true;
         } else {
             throw new Exception("Límite de inscripciones alcanzado");
         }
     }
 }
 