package encapsulate;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation {

  private final List<Integer> numbers;

  public Encapsulation() {
    numbers = new ArrayList<>();
  }

  public void addNumber(int number) {
    numbers.add(number);
  }

  public void printAllNumbers() {
    numbers.forEach(System.out::println);
  }

  public List<Integer> getNumbers() {
    return numbers;
  }
}
