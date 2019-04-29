
/**
 * Write a description of class Administrator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrator extends HospitalEmployee {
         protected String d;
         String Operating;
//Sets up doctors with specified information

     public Administrator(String empName, int empNumber, String department ) {
	super (empName, empNumber);
	d = department;
     }

//sets this doctor’s specialty
     public void setSpecialty (String department) {
	d = department;
     }

//returns this doctor’s specialty
     public String getSpecialty () {
	return d;
     }

//returns a description of this doctor as a string
     public String toString () {
	return super.toString() + "           " + d;
     }

//Prints a message related to the doctor
      public void administrate () {
	System.out.println(name + " is in the " + d + " deparatment");
     }
}
