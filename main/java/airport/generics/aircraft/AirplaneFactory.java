package airport.generics.aircraft;

import java.util.ArrayList;

public class AirplaneFactory {

    public static Airplane getAirplane(String type){

            if(type == null){
                return null;
            }
            if(type.equals("Peopleplane")){
                return new Peopleplane();

            } else if(type.equals("Cargoplane")){

                return new Cargoplane();

        } return null;
    }
    public static Airplane  getAirplane(String type,String id){
        Airplane airplane = getAirplane(type);
        airplane.setPlaneIdentification(id);
        return airplane;
    }
}

