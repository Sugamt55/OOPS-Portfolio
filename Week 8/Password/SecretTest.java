package Week8.Password;

public class SecretTest
{

public static void main(String[] args)
{
  // Secret hush = new Secret("Wil Wheaton is my hero!");
  Secret hush = new Secret("This is my very dangerous message.");
  System.out.println(hush);

  hush.encrypt();
  System.out.println(hush);

  hush.decrypt();
  System.out.println(hush);

  System.out.println();

  Password pass = new Password("This is my very dangerous message.");
  System.out.println(pass);

  pass.encrypt();
  System.out.println(pass);
  
  pass.decrypt();
  System.out.println(pass);
}
}