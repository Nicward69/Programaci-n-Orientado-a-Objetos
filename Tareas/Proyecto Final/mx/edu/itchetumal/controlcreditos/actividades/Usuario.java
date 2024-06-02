package mx.edu.itchetumal.controlcreditos.actividades;
/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */

 abstract class Usuario {
     protected String nombre;
     protected String ID;
     protected String tipoUsuario;
 
     public Usuario(String nombre, String ID, String tipoUsuario) {
         this.nombre = nombre;
         this.ID = ID;
         this.tipoUsuario = tipoUsuario;
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public String getID() {
         return ID;
     }
 
     public String getTipoUsuario() {
         return tipoUsuario;
     }
 
     public abstract void mostrarMenu();
 }
 