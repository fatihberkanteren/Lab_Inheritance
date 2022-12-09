
public class Elektrikli extends Araba {

    public int menzil;
    public int sarjSuresi;

    public void goruntule() {
        System.out.println("Elektrikli Arabanın Özellikleri : "
                + "\nRenk : " + renk
                + "\nKasa Tipi : " + kasaTipi
                + "\nTeker Boyutu : " + getTekerBoyutu()
                + "\nBeygir Gücü : " + getBeygir()
                + "\nMenzil : " + menzil
                + "\nŞarj Süresi : " + sarjSuresi + " Saat");
    }

}
