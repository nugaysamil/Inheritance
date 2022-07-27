public class Calisan { //Superclass //BaseClass

    private String isim;
    private int maas;
    private String departman;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Calisan(String isim, int maas, String departman) { //Constructor
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;

    }

    public void Calis() {
        System.out.println("Çalışan çalışıyor...");

    }
    public void bilgileriGoster() {
        System.out.println("isim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Departman : " + departman);

    }
    public void depertmanDegistir (String yeni_departman) {

        System.out.println("Departman Değiştiriliyor... ");
        this.departman = yeni_departman;
        System.out.println("Yeni departman : " + yeni_departman);

    }

}
