package me.lerufic.cobarv;

public class Pemenang {
    private String peringkat;
    private String negara;
    private String emas;
    private String perak;
    private String perunggu;
    private String total;
    private String image;

    public Pemenang(){}

    public Pemenang(String peringkat,String negara,String emas,String perak, String perunggu, String total, String image){
        this.peringkat = peringkat;
        this.negara = negara;
        this.emas = emas;
        this.perak = perak;
        this.perunggu = perunggu;
        this.total = total;
        this.image = image;
    }
    public String getPeringkat(){
        return peringkat;
    }
    public String getNegara(){
        return negara;
    }
    public String getEmas(){
        return emas;
    }
    public String getPerak(){
        return perak;
    }
    public String getPerunggu(){
        return perunggu;
    }
    public String getTotal() {
        return total;
    }
    public String getImage() {
        return image;
    }

    public void setPeringkat(String peringkat) {
        this.peringkat = peringkat;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public void setEmas(String emas) {
        this.emas = emas;
    }

    public void setPerak(String perak) {
        this.perak = perak;
    }

    public void setPerunggu(String perunggu) {
        this.perunggu = perunggu;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
