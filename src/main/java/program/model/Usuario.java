package program.model;

import program.datatypes.DtFecha;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String cedula;
    private String nombre;
    private DtFecha fechaDeIngreso;
    private List<Viaje> viajes;

    public Usuario(String cedula, String nombre, DtFecha fechaDeIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaDeIngreso = fechaDeIngreso;
        this.viajes = new ArrayList<Viaje>();
    }

    public boolean addViajes(Viaje viaje){
        if (viajes.size() < 100){
            viajes.add(viaje);
            return true;
        }
        return false;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DtFecha getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(DtFecha fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Viaje getViaje(int pos) {
        return viajes.get(pos);
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
   }

    @Override
    public String toString() {
        return "Usuario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaDeIngreso=" + fechaDeIngreso +
                ", viajes=" + viajes +
                '}';
    }
}
