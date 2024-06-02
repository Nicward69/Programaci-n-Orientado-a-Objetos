package mx.edu.itchetumal.controlcreditos.actividades;

class ActividadSocial extends Actividad {
    public ActividadSocial(String nombre, String fecha, String organizador, String responsable, int creditos, int limiteInscripciones) {
        super(nombre, fecha, organizador, responsable, creditos, limiteInscripciones, "Social");
    }
}