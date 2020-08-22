package polymorphism;

import java.util.Scanner;

public class DBTest {
  public static void main(String[] args) {
    final var scanner = new Scanner(System.in);

    System.out.print("Enter the environment: ");
    final String env = scanner.nextLine();

    final Database db =
        env.equalsIgnoreCase("staging") ? new StagingDatabase() : new ProductionDatabase();


    db.fetch();
    db.save();
    db.delete();

    scanner.close();
  }
}
