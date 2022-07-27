public class Yonetici extends Calisan { //SubClass



    private int sorumlu_kisi;
    // Extra Özellik
    public Yonetici (String isim, int maas, String departman,int sorumlu_kisi) {
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman; */

        super(isim,maas,departman);
        this.sorumlu_kisi = sorumlu_kisi;

    }

    public void  zam_yap(int zam_miktari) {
        System.out.println("Çalışanlara " + zam_miktari + " zam yapıldı.");
    }

    public void bilgileriGoster() {
        /*System.out.println("isim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getDepartman());*/
        super.bilgileriGoster();

        System.out.println("Sorumlu Kişi Sayısı : " + this.sorumlu_kisi);


    }

}
