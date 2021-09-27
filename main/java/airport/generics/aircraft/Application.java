package airport.generics.aircraft;

public class Application {

    public static void main(String[] args) {

        Airport airport=new Airport();

        Airplane airplane = new Peopleplane("GD253", 340);


        airport.addAirplane( new Peopleplane("GD253", 340));
        airport.addAirplane( new Peopleplane("XJ530", 340));
        airport.addAirplane( new Peopleplane("JD925", 340));
        airport.addAirplane( new Peopleplane("BO400", 340));
        airport.addAirplane( new Cargoplane("XX492", 340000));
        airport.addAirplane( new Cargoplane("GA953", 340000));
        airport.addAirplane( new Cargoplane("DX656", 340000));


        airport.addAirplaneToMap( new Peopleplane("GD253", 340));
        airport.addAirplaneToMap( new Peopleplane("XJ530", 340));
        airport.addAirplaneToMap( new Peopleplane("JD925", 340));
        airport.addAirplaneToMap( new Peopleplane("BO400", 340));
        airport.addAirplaneToMap( new Cargoplane("XX492", 340000));
        airport.addAirplaneToMap( new Cargoplane("GA953", 340000));
        airport.addAirplaneToMap( new Cargoplane("DX656", 340000));


        airport.printAirplanes();
        airport.load("GD253",100);
        airport.load("GD253",100);
        airport.load("GD253",100);
        airport.load("DX656",28);
        airport.load("DX656",40000);
        airport.load("DX656",40);

     //   airport.loadC("GD253",100);
        System.out.println("Singleton check");
        System.out.println("-----------------");

        // Instantiating Singleton class with variable x
        AirportService x = AirportService .getInstance();

        // Instantiating Singleton class with variable y
        AirportService  y = AirportService .getInstance();

        // Instantiating Singleton class with variable z
        AirportService  z = AirportService .getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());


        x.clean(airplane);

        System.out.println("_____________");
        System.out.println("Factory pattern");
        System.out.println("------------------");
        Airplane airplane1 = AirplaneFactory.getAirplane("Cargoplane");
        System.out.println(airplane1);

        Airplane airplane2 = AirplaneFactory.getAirplane("Cargoplane","TK1234");
        System.out.println(airplane2.getPlaneIdentification());


        System.out.println("_____________");
        System.out.println("Builder pattern");
        System.out.println("------------------");
       Airport airport1 = new AirportBuilder.Builder(1234L)
               .getAirportId(1234L)
               .addAirplane(new Peopleplane("GD253", 340))
               .build();
        System.out.println("airport1.toString() = " + airport1.toString());

    }

}
