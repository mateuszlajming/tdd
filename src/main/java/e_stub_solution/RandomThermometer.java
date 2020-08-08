package e_stub_solution;

import e_stub.Thermometer;
import java.util.Random;

public class RandomThermometer implements Thermometer {

  @Override
  public double readTemperature() {
    Random random = new Random();
    double randomTemperatureRead = random.nextDouble() * 50.0 - 20.0;

    return randomTemperatureRead;
  }
}
