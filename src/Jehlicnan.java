import java.util.Scanner;

public class Jehlicnan extends Strom{
    static Scanner sc = new Scanner(System.in);
    private int vyska;
    public Jehlicnan(){
        super();
        System.out.println("Jak je strom vysoký? (m, pište jen číslo)");
        this.vyska = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Jedná se o jehličnatý strom.");
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
