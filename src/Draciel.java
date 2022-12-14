
public class Draciel extends Beyblade{

    private String kutsalCanavar ;

    public Draciel(String beybladeci ,int donusHizi , int saldiriGucu ,String kutsalCanavar){
        super(beybladeci,donusHizi,saldiriGucu);
        this.kutsalCanavar = kutsalCanavar ;
    }

    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi :"+kutsalCanavar);
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " i ortaya cikariyor...");
        System.out.println(getBeybladeci() + " in savunmasi : Kale Savunmasi");
    }
}
