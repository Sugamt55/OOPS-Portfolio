package Week8.Staff;

public class Employee extends StaffMember
{
protected String socialSecurityNumber;
protected double payRate;

public Employee(String eName, String eAddress, String ePhone,
                String socSecNumber, double rate)
{
  super(eName, eAddress, ePhone);

  socialSecurityNumber = socSecNumber;
  payRate = rate;
}

{
  @SuppressWarnings("unused")
String result = super.toString();

  result += "\nSocial Security Number: " + socialSecurityNumber;

}

public double pay()
{
  return payRate;
}

public String vacation(){
  return null;
}
}