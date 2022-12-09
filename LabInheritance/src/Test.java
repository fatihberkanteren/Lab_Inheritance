
public class Test {

    public static void main(String[] args) {
        Elektrikli e = new Elektrikli();
        Benzinli b = new Benzinli();

        e.renk = "Siyah";
        e.kasaTipi = "Sedan";
        e.menzil = 500;
        e.sarjSuresi = 2;
        e.setBeygir(400);
        e.setTekerBoyutu(205);

        b.kasaTipi = "Coupe";
        b.motorHacmi = 1600;
        b.renk = "Mavi";
        b.silindirSayisi = 4;
        b.yakitDeposu = 50;
        b.setBeygir(150);
        b.setTekerBoyutu(185);

        e.goruntule();
        System.out.println("-----------------------------------");
        b.goruntule();

    }

}
