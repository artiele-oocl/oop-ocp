package abides;

public class Nurse extends Employee {

  public Nurse(long id, String name, String department) {
    super(id, name, department);
    System.out.println(">>> I am a nurse " + name + " <<<");
  }

  private void checkVitalSigns() {
    System.out.println("I am checking vital signs...");
  }

  private void drawBlood() {
    System.out.println("I am drawing blood...");
  }

  @Override
  public void performDuties() {
    checkVitalSigns();
    drawBlood();
  }
}
