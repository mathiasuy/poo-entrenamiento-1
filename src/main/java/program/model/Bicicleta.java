package program.model;

import program.datatypes.DtBicicleta;
import program.datatypes.DtVehiculo;
import program.datatypes.TipoBici;

public class Bicicleta extends Vehiculo {

    private TipoBici bici;
    private int cantCambios;

    public Bicicleta(int nroSerie, float porcentajeBateria, float precioBase, TipoBici bici, int cantCambios) {
        super(nroSerie, porcentajeBateria, precioBase);
        this.bici = bici;
        this.cantCambios = cantCambios;
    }

    public TipoBici getBici() {
        return bici;
    }

    public void setBici(TipoBici bici) {
        this.bici = bici;
    }

    public int getCantCambios() {
        return cantCambios;
    }

    public void setCantCambios(int cantCambios) {
        this.cantCambios = cantCambios;
    }

    @Override
    public float darPrecioViaje(int duracion, int distancia) {
        return distancia*getPrecioBase();
    }

    @Override
    public DtVehiculo getDt(){
        return new DtBicicleta(getNroSerie(),getPorcentajeBateria(),getPrecioBase(),getBici(),getCantCambios());
    }

    @Override
    public String toString() {
        return super.toString() +"Bicicleta{" +
                "bici=" + bici +
                ", cantCambios=" + cantCambios +
                '}';
    }
}

