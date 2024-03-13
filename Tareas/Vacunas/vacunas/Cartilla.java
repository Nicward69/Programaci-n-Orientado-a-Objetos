package vacunas;
import java.sql.Date;
import java.util.ArrayList;

public class Cartilla {
    Date fechaAplicacion;
    byte dosis;
    private Date fechaCreacion;
    private ArrayList<VacunaAplicada> vacunasAplicadas;

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public byte getDosis() {
        return dosis;
    }

    public void setDosis(byte dosis) {
        this.dosis = dosis;
    }

    public void setCartilla(Date fechaAplicacion, byte dosis) {
        this.fechaAplicacion = fechaAplicacion;
        this.dosis = dosis;
    }

    public void agregarVacunaAplicada(Vacuna vacuna, Date fechaAplicacion, byte dosis) {
    VacunaAplicada vacunaAplicada = new VacunaAplicada(vacuna, fechaAplicacion, dosis);
    vacunasAplicadas.add(vacunaAplicada);
    }

    public void imprimirVacunasAplicadas() {
    // Recorrer y mostrar vacunasAplicadas
    }


}
