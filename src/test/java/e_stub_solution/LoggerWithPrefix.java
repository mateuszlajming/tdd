package e_stub_solution;

public class LoggerWithPrefix implements Logger {

  @Override
  public void log(String message) {
    System.out.println("------ " + message);
  }
}
