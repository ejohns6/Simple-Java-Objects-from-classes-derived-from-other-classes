
/**
 * Write a description of class Surgeon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Surgeon extends HospitalEmployee {
         protected String speciality;
         String Operating;
//Sets up doctors with specified information

     public Surgeon(String empName, int empNumber, String special , boolean isOperating) {
    super (empName, empNumber);
    speciality = special;
          if(isOperating == true){
              Operating = "is";
            }else{
                Operating = "isn't";
            }
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
      public void operate () {

    System.out.println(name + " is a(n) " + speciality + " surgen that " +Operating +" Operating.");
     }
}