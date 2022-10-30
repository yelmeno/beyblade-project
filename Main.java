import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Hoşgeldiniz");
        System.out.println("Çıkmak için q ya basınız");

        while (true){
            System.out.println("Hangi beyblade'i seçiyorsunuz");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programndan çıkılıyor");
                break;
            }else {
                Baybladefabrikasi fabrika = new Baybladefabrikasi();
                Beyblade beyblade = fabrika.Baybladeuretimi(islem);
                if (beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade giriniz");
                }else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.KutsalCanavariOrtayacikar();
                }


            }

        }

    }
}