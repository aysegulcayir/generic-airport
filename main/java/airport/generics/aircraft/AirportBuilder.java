package airport.generics.aircraft;

import java.util.ArrayList;
import java.util.List;

public class AirportBuilder {
    public static class Builder {
        List<Airplane> airplanes = new ArrayList<>();
        long airportId;

        public Builder(long airportId) {
            this.airportId = airportId;
        }

        public Builder allList(List<Airplane> airplanes){
            this.airplanes = airplanes;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder addAirplane(Airplane airplane){
            this.airplanes.add(airplane);
            return this;
        }

        public Builder getAirportId(long airportId){
            this.airportId = airportId;

            return this;
        }

        public Airport build(){
            Airport airport = new Airport();
            airport.setId(airportId);
            airport.setAirplanes(airplanes);
            return airport;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "airplanes= " + airplanes +
                    ", airportId= " + airportId +
                    '}';
        }
    }

}
