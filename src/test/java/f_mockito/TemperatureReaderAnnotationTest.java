package f_mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import e_stub_solution.TemperatureReader;
import e_stub_solution.Thermometer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.configuration.IMockitoConfiguration;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TemperatureReaderAnnotationTest {

  @Mock
  Thermometer thermometer;

  @InjectMocks
  TemperatureReader temperatureReader;

  @Test
  public void readTemperature_whenThermometerReturns2_shouldReturn2() {
    when(thermometer.readTemperature()).thenReturn(2.0);

    double temperature = temperatureReader.readTemperature();

    assertThat(temperature).isEqualTo(2.0);
  }

}
