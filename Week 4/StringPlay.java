package Week4;

public class StringPlay{
	
   public static void main (String[] args) {
      String college = new String ("Leeds Beckett University");

      String town = ", Anytown, UK";

      int stringLength = college.length();

      System.out.println (college + " contains " + stringLength + " characters.");
      System.out.print("\n");

      String changed = college.concat(town);

      System.out.println ("The final string is " + changed);
    }
}
