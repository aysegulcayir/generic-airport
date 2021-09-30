package airport.generics.aircraft;
@FunctionalInterface
public interface AirplaneI <T,U>  {
    public T switchAirplaneSituations(T t,U u);
}
