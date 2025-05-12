import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LesAPP {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    List<Strom> listStromu = new ArrayList<Strom>();
        System.out.println("Ahoj");
        System.out.println("Kolik chceš přidat stromů?");
        int pocet = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < pocet; i++){
            System.out.println("Jaký tip stromu chcete načíst?");
            System.out.println("1. Jehličnan");
            System.out.println("2. Listnáč");
            int tip = sc.nextInt();
            switch(tip){
                case 1:
                    Jehlicnan j = new Jehlicnan();
                    listStromu.add(j);
                    break;
                case 2:
                    Listnac l = new Listnac();
                    listStromu.add(l);
                    break;
            }
        }
        System.out.println("Výpis informací o všech jehličnanech.");
        for(int i = 0; i < listStromu.size(); i++){
            if(listStromu.get(i) instanceof Jehlicnan){
                listStromu.get(i).vypisInfo();
            }
        }
        while(true) {
            System.out.println("Vítej v menu.");
            System.out.println("Co chcete dělat?");
            System.out.println("1. Výpis druhu dřeva nejstaršího stromu.");
            System.out.println("2. Výpis barvy květů všech listnatých stromů, které jsou starší než 10 let");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    String druh = " ";
                    int rok = 999999999;
                    for (int i = 0; i < listStromu.size(); i++) {
                        if (listStromu.get(i).getRokZasazeni() < rok) {
                            druh = listStromu.get(i).getDruhDreva();
                        }
                    }
                    System.out.println("Druh dřeva nejstaršího stromu je " + druh);
                    break;
                case 2:
                    System.out.println("Listnaté stromy mají barvy květů:");
                    for (int i = 0; i < listStromu.size(); i++) {
                        if(listStromu.get(i) instanceof Listnac && (2025-listStromu.get(i).getRokZasazeni()) > 10){
                            System.out.println(((Listnac) listStromu.get(i)).getBarvaKvetu());
                        }
                    }
                    break;
            }
        }

    }
}