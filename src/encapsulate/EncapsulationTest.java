package encapsulate;

import java.util.List;

public class EncapsulationTest {
  public static void main(String[] args) {

    final var encapsulation = new Encapsulation();

    encapsulation.addNumber(1);
    encapsulation.addNumber(2);
    encapsulation.addNumber(3);
    encapsulation.addNumber(4);
    encapsulation.addNumber(5);

    encapsulation.printAllNumbers();

    System.out.println("------------------");

    final List<Integer> numbers = encapsulation.getNumbers();
    numbers.add(6);

    encapsulation.printAllNumbers();
  }
}
