package Week9.Bank;

public class Manager extends Account {

    private Account[] acc;
    
    public Manager() {
        
        acc = new Account[5];

        acc[0] = new Account("Carl", 782143313, "Los Santos", 350);
        acc[1] = new Account("Ryder", 682143371, "Texas", 280);
        acc[2] = new Account("Frank", 829361010, "Lousiana", 120);
        acc[3] = new Account("Bart", 973835598, "Los Angeles", 1600);
        acc[4] = new Account("Reynolds", 887122165, "California", 20000);

    }

    public Account[] getAcc() {
        return acc;
    }


    public void display(){
        for (Account obj : acc){
            System.out.println(obj);
        }
    }

}