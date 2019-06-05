package program.datatypes;

public class DtFechaBase {

    private DtFecha fecha;
    private int duracion;
    private int distancia;

    public DtFechaBase(DtFecha fecha, int duracion, int distancia) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.distancia = distancia;
    }

    public DtFecha getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return "DtFechaBase{" +
                "fecha=" + fecha +
                ", duracion=" + duracion +
                ", distancia=" + distancia +
                '}';
    }
}
