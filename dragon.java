public class dragon extends Beyblade{
    private String KutsalCanavar;
    private String GizliYetenek;
    public dragon(String beybladeci, int donusHizi, int saldiriGucu , String KutsalCanavar, String GizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar=KutsalCanavar;
        this.GizliYetenek=GizliYetenek;
    }

    @Override
    public void KutsalCanavariOrtayacikar() {
        System.out.println(getBeybladeci()+ KutsalCanavar + "kutsal canavarı ortaya çıkıyor..");
        System.out.println(getBeybladeci()+ KutsalCanavar+ "özelliği Hayalet Saldırısı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(getBeybladeci() + "Kutsal canavarı" + KutsalCanavar);
        System.out.println(getBeybladeci()+ "Gizli yeteneği"+ GizliYetenek);
    }
}
