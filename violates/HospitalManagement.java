package violates;

public class HospitalManagement {

  public void callUpon(Employee employee) {
    if (employee instanceof Doctor) {
      prescribeMedicine();
      diagnosePatient();
    } else {
      checkVitalSigns();
      drawBlood();
    }
  }

  // Nurse actions
  private void checkVitalSigns() {
    System.out.println("I am checking vital signs...");
  }

  private void drawBlood() {
    System.out.println("I am drawing blood...");
  }

  // Doctor actions
  private void prescribeMedicine() {
    System.out.println("I am prescribing medicine...");
  }

  private void diagnosePatient() {
    System.out.println("I am diagnosing patient...");
  }
}
