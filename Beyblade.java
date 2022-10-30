public class Beyblade {
    private String Beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public String getBeybladeci() {
        return Beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        Beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        Beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }
    public void saldir (){
        System.out.println(Beybladeci + "" + saldiriGucu+ "ve"+ donusHizi+ " ile saldırıyor..");
    }
    public void KutsalCanavariOrtayacikar(){
        System.out.println(Beybladeci+"Kutsal canavarı bulunmuyor");
    }
    public void bilgileriGoster(){
        System.out.println("Beybladeci ismi: "+Beybladeci );
        System.out.println("Beybladeci gücü: "+saldiriGucu );
        System.out.println("Beybladeci hızı: "+donusHizi );
    }
}
