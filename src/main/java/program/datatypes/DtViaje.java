package program.datatypes;

public class DtViaje extends DtViajeBase{

    private float precioTotal;
    private DtVehiculo vehiculo;

    public DtViaje(DtFecha fecha, int duracion, int distancia, float precioTotal, DtVehiculo vehiculo) {
        super(fecha, duracion, distancia);
        this.precioTotal = precioTotal;
        this.vehiculo = vehiculo;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public DtVehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return  super.toString() +  "DtViaje{" +
                "precioTotal=" + precioTotal +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
