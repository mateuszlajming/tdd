package e_stub_solution;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TemperatureReaderTest {

  @Test
  public void readTemperature_temperatureReaderShouldReturnTheTemperatureFromThermometer() {
    Thermometer thermometerStub = new ThermometerStub();
    TemperatureReader temperatureReader = new TemperatureReader(thermometerStub);

    double temperature = temperatureReader.readTemperature();
    Assertions.assertThat(temperature).isEqualTo(2);
  }

}