import java.util.Scanner;

public class Listnac extends Strom{
    static Scanner sc = new Scanner(System.in);
    private String barvaKvetu;
    public Listnac(){
        super();
        System.out.println("Jakou má strom barvu květu?");
        this.barvaKvetu = sc.nextLine();
    }

    public String getBarvaKvetu() {
        return barvaKvetu;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Jedná se o listnatý strom.");
    }
    @Override
    public String getDruhDreva() {
        return super.getDruhDreva();
    }
    @Override
    public int getRokZasazeni() {
        return super.getRokZasazeni();
    }
}
