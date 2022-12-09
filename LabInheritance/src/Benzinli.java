
public class Benzinli extends Araba {

    public int motorHacmi;
    public int yakitDeposu;
    public int silindirSayisi;

    public void goruntule() {
        System.out.println("Benzinli Arabanın Özellikleri : "
                + "\nRenk : " + renk
                + "\nKasa Tipi : " + kasaTipi
                + "\nTeker Boyutu : " + getTekerBoyutu()
                + "\nBeygir Gücü : " + getBeygir()
                + "\nMotor Hacmi : " + this.motorHacmi
                + "\nYakıt Deposu : " + this.yakitDeposu + " lt"
                + "\nSilindir Sayisi : " + this.silindirSayisi);
    }
}
