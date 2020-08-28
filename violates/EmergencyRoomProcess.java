package violates;

// acts as client class
public class EmergencyRoomProcess {
  public static void main(String[] args) {
    HospitalManagement ERDirector = new HospitalManagement();

    Employee nurseJoy = new Nurse(0, "Joy", "Emergency");
    ERDirector.callUpon(nurseJoy);
    Employee doctorLester = new Doctor(1, "Lester", "Emergency");
    ERDirector.callUpon(doctorLester);
  }
}
