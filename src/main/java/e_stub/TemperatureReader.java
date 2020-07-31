package e_stub;

public class TemperatureReader {

  private Thermometer thermometer;

  public TemperatureReader() {
    thermometer = new RandomThermometer();
  }

  public double readTemperature() {
    if (thermometer != null) {
      return thermometer.readTemperature();
    }
    return Double.MIN_VALUE;
  }
}
