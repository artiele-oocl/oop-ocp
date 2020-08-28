package violates;

public class Doctor extends Employee {

  public Doctor(long id, String name, String department) {
    super(id, name, department);
    System.out.println(">>> I am a doctor " + name + " <<<");
  }

}
