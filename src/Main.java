import java.util.Scanner;

public class Main {
    public static void main(String []args){

        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q ya basin");

        Scanner scn = new Scanner(System.in);

        while(true){

            String beybladeler = "Dranza \n"
                    + "Drayga \n"
                    + "Draciel \n"
                    + "Dragon";

            System.out.println(beybladeler);

            System.out.print("Hangi beyblade'i uretmek istiyorsunuz :");
            String islem = scn.nextLine() ;
            if(islem.equals("q")){

                System.out.println("Sistemden Cikiliyor..");

                break ;
            }

            else  {

                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);

                if(beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade ismi girin..");
                }else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.bilgileriGoster();
                }


            }


        }


    }
}
