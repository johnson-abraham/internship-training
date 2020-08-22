package polymorphism;

public class StagingDatabase implements Database {

  @Override
  public void fetch() {
    System.out.println("Fetching from staging DB");
  }

  @Override
  public void save() {
    System.out.println("Saving to staging DB");
  }

  @Override
  public void delete() {
    System.out.println("Deleting from staging DB");
  }
}
