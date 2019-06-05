package program.model;

import program.datatypes.DtFecha;

public class Viaje {

    private DtFecha fecha;
    private int duracion;
    private int distancia;
    private Vehiculo vechiculo;

    public Viaje(DtFecha fecha, int duracion, int distancia, Vehiculo vechiculo) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.distancia = distancia;
        this.vechiculo = vechiculo;
    }

    public DtFecha getFecha() {
        return fecha;
    }

    public void setFecha(DtFecha fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVechiculo() {
        return vechiculo;
    }

    public void setVechiculo(Vehiculo vechiculo) {
        this.vechiculo = vechiculo;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "fecha=" + fecha +
                ", duracion=" + duracion +
                ", distancia=" + distancia +
                ", vechiculo=" + vechiculo +
                '}';
    }
}
