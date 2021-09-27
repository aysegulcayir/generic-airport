package airport.generics.aircraft;

public class AirportService {

    private static AirportService airportService_instance = null;
    private Airplane airplane ;

    private AirportService()
    {

    }

    public static AirportService getInstance()
    {
        if (airportService_instance == null)
            airportService_instance = new AirportService();

        return airportService_instance;
    }

  public void clean(Airplane airplane){
       //AirportService.getInstance().clean(airplane);
      airplane.clean();

  }
}
