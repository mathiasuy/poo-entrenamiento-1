package program.datatypes;

public class DtVehiculo {

    private int nroSerie;
    private float porcentaje;
    private float precioBase;

    public DtVehiculo(int nroSerie, float porcentaje, float precioBase) {
        this.nroSerie = nroSerie;
        this.porcentaje = porcentaje;
        this.precioBase = precioBase;
    }

    public int getNroSerie() {
        return nroSerie;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return "DtVehiculo{" +
                "nroSerie=" + nroSerie +
                ", porcentaje=" + porcentaje +
                ", precioBase=" + precioBase +
                '}';
    }
}
