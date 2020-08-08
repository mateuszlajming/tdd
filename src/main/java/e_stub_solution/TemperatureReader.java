package e_stub_solution;

public class TemperatureReader {

  private Thermometer thermometer;

  public TemperatureReader(Thermometer thermometer) {
    this.thermometer = thermometer;
  }

  public double readTemperature() {
    if (thermometer != null) {
      return thermometer.readTemperature();
    }
    return Double.MIN_VALUE;
  }
}
