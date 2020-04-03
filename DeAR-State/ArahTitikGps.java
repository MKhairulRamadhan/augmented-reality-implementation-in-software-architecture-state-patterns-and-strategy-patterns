public class ArahTitikGps{
    String lokasiId;
    String arahMataAngin;
    String kiri;
    String depan;
    String kanan;

    public ArahTitikGps(String lokasiId, String arahMataAngin){
        this.lokasiId = lokasiId;
        this.arahMataAngin = arahMataAngin;
    }

    public String getLokasiId(){
        return lokasiId;
    }
    public void setLokasiId(String lokasiId){
        this.lokasiId = lokasiId;
    }

    public String getArahMataAngin(){
        return arahMataAngin;
    }
    public void setArahMataAngin(String arahMataAngin){
        this.arahMataAngin = arahMataAngin;
    }

    public String getKiri(){
        return kiri;
    }
    public void setKiri(String kiri){
        this.kiri = kiri;
    }

    public String getDepan(){
        return depan;
    }
    public void setDepan(String depan){
        this.depan = depan;
    }

    public String getKanan(){
        return kanan;
    }
    public void setKanan(String kanan){
        this.kanan = kanan;
    }
}