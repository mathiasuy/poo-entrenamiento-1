package program.datatypes;

public class DtBicicleta extends DtVehiculo {

    private TipoBici bici;
    private int cantCambios;

    public DtBicicleta(int nroSerie, float porcentaje, float precioBase, TipoBici bici, int cantCambios) {
        super(nroSerie, porcentaje, precioBase);
        this.bici = bici;
        this.cantCambios = cantCambios;
    }

    public TipoBici getBici() {
        return bici;
    }

    public int getCantCambios() {
        return cantCambios;
    }

    @Override
    public String toString() {
        return super.toString() +"DtBicicleta{" +
                "bici=" + bici +
                ", cantCambios=" + cantCambios +
                '}';
    }
}
