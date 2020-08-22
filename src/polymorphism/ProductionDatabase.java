package polymorphism;

public class ProductionDatabase implements Database {

  @Override
  public void fetch() {
    System.out.println("Fetching from Production Database");
  }

  @Override
  public void save() {
    System.out.println("Saving to Production Database");
  }

  @Override
  public void delete() {
    System.out.println("Deleting from Production Database");
  }
}
