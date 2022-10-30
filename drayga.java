public class drayga extends Beyblade{
    private String KutsalCanavar;
    public drayga(String beybladeci, int donusHizi, int saldiriGucu, String KutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar= KutsalCanavar;
    }

    @Override
    public void KutsalCanavariOrtayacikar() {
        System.out.println(getBeybladeci()+ KutsalCanavar + "kutsal canavarı ortaya çıkıyor..");
        System.out.println(getBeybladeci()+ KutsalCanavar+ "özelliği Kaplan Pençesi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(getBeybladeci() + "Kutsal canavarı" + KutsalCanavar);
    }

    }


