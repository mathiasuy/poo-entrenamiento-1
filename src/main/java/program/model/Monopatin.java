package program.model;

import program.datatypes.DtMonopatin;
import program.datatypes.DtVehiculo;

public class Monopatin extends Vehiculo{

    private boolean tieneLuces;

    public Monopatin(int nroSerie, float porcentajeBateria, float precioBase, boolean tieneLuces) {
        super(nroSerie, porcentajeBateria, precioBase);
        this.tieneLuces = tieneLuces;
    }

    public boolean isTieneLuces() {
        return tieneLuces;
    }

    public void setTieneLuces(boolean tieneLuces) {
        this.tieneLuces = tieneLuces;
    }

    @Override
    public DtVehiculo getDt(){
        return new DtMonopatin(getNroSerie(),getPorcentajeBateria(),getPrecioBase(),isTieneLuces());
    }


    @Override
    public float darPrecioViaje(int duracion, int distancia) {
        float precio;
        if (tieneLuces){
            precio = (1/2)*duracion+distancia*getPrecioBase();
        }else{
            precio = distancia*getPrecioBase();
        }
        return precio;
    }
}
