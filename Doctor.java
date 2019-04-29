//Doctor should extend HospitalEmployee, Surgeon should extend Doctor…

public class Doctor extends HospitalEmployee {
     protected String speciality;

//Sets up doctors with specified information

     public Doctor (String empName, int empNumber, String special) {
	super (empName, empNumber);
	speciality = special;
     }

//sets this doctor’s specialty
     public void setSpecialty (String special) {
	speciality = special;
     }

//returns this doctor’s specialty
     public String getSpecialty () {
	return speciality;
     }

//returns a description of this doctor as a string
     public String toString () {
	return super.toString() + "           " + speciality;
     }

//Prints a message related to the doctor
      public void diagnose () {
	System.out.println(name + " is a(n) " + speciality + " doctor.");
     }
}
