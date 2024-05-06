package Week7.Hospital;

public class Hospital {

	public static void main(String[] args) {
		
		Doctor work = new Doctor(); 
		Nurse check = new Nurse();
		Receptionist bill_c = new Receptionist();
		Cleaner cl = new Cleaner();
		
		work.start_shift();
		work.surgery();
		work.end_shift();
	
		
		check.start_shift();
		check.check_p();
		check.end_shift();
		
		bill_c.start_shift();
		bill_c.bills();
		bill_c.end_shift();
		
		cl.start_shift();
		cl.clean();
		cl.end_shift();
		
		
	}

}