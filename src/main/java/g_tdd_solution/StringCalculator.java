package g_tdd_solution;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class StringCalculator {

  public static final String SEPARATOR_REGEX = "[,;\n]";

  public int add(String numbers) {
    checkForNull(numbers);

    if (isEmpty(numbers)) {
      return 0;
    }

    return calculateSum(numbers);
  }

  private void checkForNull(String numbers) {
    if (numbers == null) {
      throw new IllegalArgumentException("null not allowed");
    }
  }

  private boolean isEmpty(String numbers) {
    return numbers.equals("");
  }

  private int calculateSum(String numbersString) {
    var numbers = splitNumbers(numbersString);

    var all = partitionByBeingNegative(numbers);
    var negatives = all.get(true);
    var nonNegatives = all.get(false);

    if (!negatives.isEmpty()) {
      throwNegativeException(negatives);
    }
    return nonNegatives.stream().filter(lowerOrEqualTo1000()).mapToInt(Integer::intValue).sum();
  }

  private Map<Boolean, List<Integer>> partitionByBeingNegative(List<String> numbers) {
    return numbers.stream().map(Integer::parseInt).collect(partitioningBy(isNegative()));
  }

  private Predicate<Integer> isNegative() {
    return number -> number < 0;
  }

  private Predicate<Integer> lowerOrEqualTo1000() {
    return number -> number <= 1000;
  }

  private void throwNegativeException(List<Integer> negatives) {
    throw new IllegalArgumentException(generateExceptionMessage(negatives));
  }

  private String generateExceptionMessage(List<Integer> numbers) {
    var exceptionMessage = "negatives not allowed: " + numbers.stream().map(Object::toString).collect(joining(","));
    throw new IllegalArgumentException(exceptionMessage);
  }

  private List<String> splitNumbers(String numbers) {
    var separatorRegex = SEPARATOR_REGEX;
    if (isSeparatorDefined(numbers)) {
      separatorRegex = obtainSeparator(numbers);
      numbers = getOnlyNumbers(numbers);
    }
    return Arrays.asList(numbers.split(separatorRegex));
  }

  private boolean isSeparatorDefined(String numbers) {
    return numbers.startsWith("//");
  }

  private String obtainSeparator(String numbers) {
    numbers = numbers.replaceFirst("//", "");
    var parts = numbers.split("\n");
    return parts[0];
  }

  private String getOnlyNumbers(String numbers) {
    return numbers.substring(4);
  }
}
