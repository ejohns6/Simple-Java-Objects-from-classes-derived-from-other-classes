//Create several objects from classes derived from HospitalEmployee.
public class Hospital {
	public static void main (String [] args) {
	     HospitalEmployee vito = new HospitalEmployee ("Vito", 123);
	     Doctor michael = new Doctor ("Michael", 234, "Heart"); //name, employee num, specialty
	     Surgeon vincent = new Surgeon ("Vincent", 645, "Brain", true);//name, employee num, specialty, isOperating
	     Nurse sonny = new Nurse ("Sonny", 789, 6); //name, employee num, num of Patients
	     Administrator luca = new Administrator ("Luca", 375, "Business"); //name, employee num, department
	     Receptionist tom = new Receptionist ("Tom", 951, "Talking", true); //name, employee num, department, on phone

	     //print the employees
	     System.out.println(vito);
	     System.out.println(michael);
	     System.out.println(vincent);
	     System.out.println(sonny);
	     System.out.println(luca);
	     System.out.println(tom);

	     //invoke the specific methods of the objects
	    vito.work();
   michael.diagnose();
	   vincent.operate();
	   sonny.assist();
	   luca.administrate();
	   tom.answer();
	}
}
