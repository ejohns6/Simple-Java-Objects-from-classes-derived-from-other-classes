
/**
 * Write a description of class Receptionist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receptionist extends HospitalEmployee {

protected String department;
String Phone;
//Sets up doctors with specified information

     public Receptionist(String empName, int empNumber, String departments, boolean onPhone) {
	super (empName, empNumber);
	department = departments;
	if(onPhone == true){
              Phone = "on";
            }else{
                Phone = "not on";
            }
     }

//sets this doctor’s specialty
     public void setSpecialty (String departments) {
	department = departments;
     }

//returns this doctor’s specialty
     public String getSpecialty () {
	return department;
     }

//returns a description of this doctor as a string
     public String toString () {
	return super.toString() + "           " + department;
     }

//Prints a message related to the doctor
      public void answer () {
	System.out.println(name + " is  " + department + " " +Phone +" the phone");
     }
}
