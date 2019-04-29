
/**
 * Write a description of class Nurse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nurse extends HospitalEmployee {
     protected int numOfPatient;
         public Nurse(String empName, int empNumber, int numOfPatients) {
    super (empName, empNumber);
    numOfPatient = numOfPatients;
     }
          public String toString () {
	return super.toString() + "           " + numOfPatient;
     }



//Prints a message related to the doctor
      public void assist () {
    System.out.println(name + " is a(n) " +" nurse with " +numOfPatient +" patients");
     }
}
