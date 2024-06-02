package mx.edu.itchetumal.controlcreditos.actividades;

class ActividadCultural extends Actividad {
    public ActividadCultural(String nombre, String fecha, String organizador, String responsable, int creditos, int limiteInscripciones) {
        super(nombre, fecha, organizador, responsable, creditos, limiteInscripciones, "Cultural");
    }
}