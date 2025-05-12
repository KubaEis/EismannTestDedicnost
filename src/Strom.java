import java.util.Scanner;
public class Strom {
    static Scanner sc = new Scanner(System.in);
    private String druhDreva;
    private int rokZasazeni;
    public Strom() {
        System.out.println("Jaký má strom druh dřeva?");
        this.druhDreva = sc.nextLine();
        System.out.println("Jaký rok byl strom zasazen?");
        this.rokZasazeni = sc.nextInt();
        sc.nextLine();
    }
    public void vypisInfo(){
        System.out.println("Strom má druh dřeva "+druhDreva+" a je "+(2025-rokZasazeni)+" let starý.");
    }

    public String getDruhDreva() {
        return druhDreva;
    }

    public int getRokZasazeni() {
        return rokZasazeni;
    }
}
