package Week8.Staff;

public class Volunteer extends StaffMember
{

public Volunteer(String eName, String eAddress, String ePhone)
{
  super(eName, eAddress, ePhone);
}

public double pay()
{
  return 0.0;
}

public String vacation(){
  return name + " gets 4 days vacation.";
}
}