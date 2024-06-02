package mx.edu.itchetumal.controlcreditos.actividades;

class ActividadAcademica extends Actividad {
    public ActividadAcademica(String nombre, String fecha, String organizador, String responsable, int creditos, int limiteInscripciones) {
        super(nombre, fecha, organizador, responsable, creditos, limiteInscripciones, "Académica");
    }
}