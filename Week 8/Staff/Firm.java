package Week8.Staff;

public class Firm
{

public static void main(String[] args)
{
  Staff personnel = new Staff();

  personnel.payday();

  Employee emp = new Executive("Jakob", "Jamaica", "9812311", "1842", 22);
  System.out.println();
  System.out.println(emp);
  System.out.println(emp.vacation());

  emp = new Hourly("Niko", "Serbia", "7241541", "4421", 27);
  System.out.println();
  System.out.println(emp);
  System.out.println(emp.vacation());

  StaffMember vol = new Volunteer("Roman", "Russia", "6125412522");
  System.out.println();
  System.out.println(vol);
  System.out.println(vol.vacation());
}
}