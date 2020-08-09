package f_mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import e_stub_solution.TemperatureReader;
import e_stub_solution.Thermometer;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class TemperatureReaderTest {

  @Test
  public void readTemperature_whenThermometerReturns2_shouldReturn2() {
    Thermometer mockedThermometer = mock(Thermometer.class);
    when(mockedThermometer.readTemperature()).thenReturn(2.0);
    TemperatureReader temperatureReader = new TemperatureReader(mockedThermometer);

    double temperature = temperatureReader.readTemperature();

    Assertions.assertThat(temperature).isEqualTo(2);
  }

  @Test
  public void readTemperature_shouldReadTemperatureFromThermometer() {
    Thermometer mockedThermometer = mock(Thermometer.class);
    TemperatureReader temperatureReader = new TemperatureReader(mockedThermometer);

    temperatureReader.readTemperature();

    verify(mockedThermometer).readTemperature();
  }
}
