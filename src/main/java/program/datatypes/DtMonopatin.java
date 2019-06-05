package program.datatypes;

public class DtMonopatin extends DtVehiculo {
    private boolean tieneLuces;

    public DtMonopatin(int nroSerie, float porcentaje, float precioBase, boolean tieneLuces) {
        super(nroSerie, porcentaje, precioBase);
        this.tieneLuces = tieneLuces;
    }

    public boolean isTieneLuces() {
        return tieneLuces;
    }

    @Override
    public String toString() {
        return super.toString() + "DtMonopatin{" +
                "tieneLuces=" + tieneLuces +
                '}';
    }

}
