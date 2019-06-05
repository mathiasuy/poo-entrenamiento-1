package program.model;

public abstract class Vehiculo {

    private int nroSerie;
    private float porcentajeBateria;
    private float precioBase;

    public Vehiculo(int nroSerie, float porcentajeBateria, float precioBase) {
        this.nroSerie = nroSerie;
        this.porcentajeBateria = porcentajeBateria;
        this.precioBase = precioBase;
    }

    /**
     * Un metdo es abstracto porque no se implementa aca, lo implementa la clase hija, esto porque suele ser diferente la implementacion depende del hijo
     * si una clase tiene un metodo abstracto, entonces esa clase pasa a ser abstracta
     * @param duracion
     * @param distancia
     * @return
     */
    public abstract float darPrecioViaje(int duracion, int distancia);

    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }

    public void setPorcentajeBateria(float porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public int getNroSerie() {
        return nroSerie;
    }

    public float getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nroSerie=" + nroSerie +
                ", porcentajeBateria=" + porcentajeBateria +
                ", precioBase=" + precioBase +
                '}';
    }
}
