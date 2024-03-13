package vacunas;

public class Vacuna {
    String clave;
    String nombre;
    String descripcion;
    byte numDosis;
    short periodoEntreDosisMeses;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getNumDosis() {
        return numDosis;
    }

    public void setNumDosis(byte numDosis) {
        this.numDosis = numDosis;
    }

    public short getPeriodoEntreDosisMeses() {
        return periodoEntreDosisMeses;
    }

    public void setPeriodoEntreDosisMeses(short periodoEntreDosisMeses) {
        this.periodoEntreDosisMeses = periodoEntreDosisMeses;
    }

    public void setVacuna(String clave, String nombre, String descripcion, byte numDosis, short periodoEntreDosisMeses) {
        this.clave = clave;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numDosis = numDosis;
        this.periodoEntreDosisMeses = periodoEntreDosisMeses;
    }

}
