class Fecha {
    private byte dia;
    private byte mes;
    private short anio;

    // Constructor
    public Fecha(byte dia, byte mes, short anio) {
        setFecha(dia, mes, anio);
    }

    // Getters y Setters
    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    // Método para establecer la fecha
    public void setFecha(byte dia, byte mes, short anio) {
        // Aquí podrías añadir validaciones para asegurarte de que la fecha es válida
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Método para obtener la fecha como String con separador /
    public String getFecha() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }

    // Método para obtener la fecha como String con un separador específico
    public String getFecha(char separador) {
        return String.format("%02d%c%02d%c%04d", dia, separador, mes, separador, anio);
    }
}
