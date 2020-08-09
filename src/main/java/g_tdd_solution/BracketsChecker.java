package g_tdd_solution;

import java.util.LinkedList;

public class BracketsChecker {

  public static final char OPENING_SQUARE_BRACKET = '[';

  boolean check(String s) {
    var stack = new LinkedList<Character>();
    for (var character : s.toCharArray()) {
      if (isOpeningSquareBracket(character)) {
        stack.push(character);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        var characterFromStack = stack.pop();
        if (!isOpeningSquareBracket(characterFromStack)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean isOpeningSquareBracket(char character) {
    return character == OPENING_SQUARE_BRACKET;
  }
}
