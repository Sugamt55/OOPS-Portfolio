package Week9.Postal;

public class Details extends PostOffice{
    
    PostOffice[] po;

    Details() {

        po = new PostOffice[6];

        po[0] = new PostOffice("Jason\tStockholm", "6022");
        po[1] = new PostOffice("Ryan\tTeland", "1282");
        po[2] = new PostOffice("Tom\tSharpy", "9634");
        po[3] = new PostOffice("Aaron\tSaul", "6201");
        po[4] = new PostOffice("Chris\tHenry", "3147");

    }

    public PostOffice getPo(int x) {
        return po[x];
    }

    public void setPo(String fn, String ln, String pc) {
        String name = fn + "\t" + ln;
        po[5] = new PostOffice(name, pc);
    }


    public void display() {
        for (PostOffice obj : po) {
            System.out.println(obj);
        }
    }

}