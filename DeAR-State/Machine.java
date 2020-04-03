public class Machine {
    State offCam;
    State onCam;
    State nointernet;
    State nogps;

    State state = new OffCam(this);
    boolean internetConnection = false;
    boolean gpsConnection = false;

    public Machine(){
        offCam = new OffCam(this);
        onCam = new OnCam(this);
        nointernet = new NoInternet(this);
        nogps = new NoGps(this);
    }

    /** Arah */
    DataGps data = new DataGps();

    public void cekLokasi(ArahTitikGps arah){
        String [][] simpan = data.getDataGps();
        for(int baris = 0 ; baris<simpan.length ; baris++){
            if (arah.getLokasiId().equals(simpan[baris][0]) && arah.getArahMataAngin().equals(simpan[baris][1])) {
                arah.setKiri(simpan[baris][2]);
                arah.setDepan(simpan[baris][3]);
                arah.setKanan(simpan[baris][4]);
            }
        }
    }

    public void tampil(ArahTitikGps arah) {
        state = onCam;
        state.tampil(arah);
    }
    // public void tampil(ArahTitikGps arah){
    //     if (gpsConnection == true && internetConnection == true) {
    //         System.out.println("Kiri  :"+arah.getKiri());
    //         System.out.println("Depan :"+arah.getDepan());
    //         System.out.println("Kanan :"+arah.getKanan());
    //     }else{
    //         System.out.println("Mohon maaf, internet atau gps anda mati");
    //     }
    // }
    /** Arah End */

    public void setState(State state){
        this.state = state;
    }
    
    public boolean getInternetConnection(){
        return internetConnection;
    }

    public boolean getGpsConnection(){
        return gpsConnection;
    }

    void turnOn(){
        state = onCam;
        state.turnOn();
    }
    void turnOff(){
        state = offCam;
        state.turnOff();
    }
    public void noInternet() {
        state = nointernet;
        state.noInternet();
    }
    public void noGps() {
        state = nogps;
        state.noGps();
    }

    public State getTurnOnCam(){ return onCam; }
    public State getTurnOffCam(){ return offCam; }
    public State getNointernet(){ return nointernet; }
    public State getNogps(){ return nogps; }

    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("D-AR");
        return result.toString();
    }
}