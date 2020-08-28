package abides;

public class Doctor extends Employee {

  public Doctor(long id, String name, String department) {
    super(id, name, department);
    System.out.println(">>> I am a doctor " + name + " <<<");
  }

  private void prescribeMedicine() {
    System.out.println("I am prescribing medicine...");
  }

  private void diagnosePatient() {
    System.out.println("I am diagnosing patient...");
  }

  @Override
  public void performDuties() {
    // TODO Auto-generated method stub
    prescribeMedicine();
    diagnosePatient();
  }
}
