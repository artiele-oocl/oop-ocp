package violates;

public class Nurse extends Employee {

  public Nurse(long id, String name, String department) {
    super(id, name, department);
    System.out.println(">>> I am a nurse " + name + " <<<");
  }
}
