package mx.edu.itchetumal.controlcreditos.actividades;
/**
 * Instituto Tecnológico de Chetumal
 * Sistema de Control de Créditos Complementarios
 * Autores: Camara Torres Cesar Augusto
 */

 class ActividadAcademica extends Actividad {
    public ActividadAcademica(String nombre, String fecha, String organizador, String responsable, int creditos, int limiteInscripciones) {
        super(nombre, fecha, organizador, responsable, creditos, limiteInscripciones, "Académica");
    }
}
