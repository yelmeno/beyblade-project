public class Baybladefabrikasi {
    public Beyblade Baybladeuretimi (String Beyblade_turu) {
        if (Beyblade_turu.equals("dragon")) {
            return new dragon("Takao", 800, 500, "Mavi Ejderha", "Kutsal canavar ile konuşma");

        } else if (Beyblade_turu.equals("draciel")) {
            return new draciel("Max", 400, 1000, "Kara Kaplumbağa");

        } else if (Beyblade_turu.equals("drayga")) {
            return new drayga("Rei", 800, 250, "Beyaz Kaplan");
        } else if (Beyblade_turu.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
        } else {
            return null;
        }
    }
}
