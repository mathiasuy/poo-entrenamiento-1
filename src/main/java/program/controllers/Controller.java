package program.controllers;

import com.sun.javaws.exceptions.InvalidArgumentException;
import program.datatypes.DtBicicleta;
import program.datatypes.DtFecha;
import program.datatypes.DtMonopatin;
import program.datatypes.DtVehiculo;
import program.model.Bicicleta;
import program.model.Monopatin;
import program.model.Usuario;
import program.model.Vehiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Controller {

    HashMap<String,Usuario> usuarios = new HashMap<String, Usuario>();
    HashMap<Integer, Vehiculo> vehiculos = new HashMap<Integer, Vehiculo>();

    public void registrarUsuario(String ci, String nombre) throws Exception {
        Date ahora = new Date();
        Usuario usuario = new Usuario(ci,nombre, new DtFecha(ahora.getDay(),ahora.getMonth(),ahora.getYear()));
        if (usuarios.containsKey(usuario.getCedula())){
            throw new Exception("Usuario duplicado");
        }
        usuarios.put(usuario.getCedula(),usuario);
    }

    public void agregarVehiculo(DtVehiculo dtVehiculo) throws Exception {
        if (vehiculos.containsKey(dtVehiculo.getNroSerie())){
            throw new Exception("Ya existe el vehiuclo");
        }
        if (dtVehiculo.getPorcentaje() >100 && dtVehiculo.getPorcentaje() <0 ){
            throw new Exception("Vehiculo invalido");
        }
        if (dtVehiculo instanceof DtMonopatin){
            DtMonopatin monopatin = (DtMonopatin)dtVehiculo;
            vehiculos.put(dtVehiculo.getNroSerie(),new Monopatin(monopatin.getNroSerie(),monopatin.getPorcentaje(),monopatin.getPrecioBase(),monopatin.isTieneLuces()));
        }else{
            DtBicicleta bicicleta = (DtBicicleta)dtVehiculo;
            vehiculos.put(dtVehiculo.getNroSerie(),new Bicicleta(bicicleta.getNroSerie(),bicicleta.getPorcentaje(),bicicleta.getPrecioBase(),bicicleta.getBici(),bicicleta.getCantCambios()));
        }
    }

    public List<DtVehiculo> getBicicletas(){
        return null;
    }


}
