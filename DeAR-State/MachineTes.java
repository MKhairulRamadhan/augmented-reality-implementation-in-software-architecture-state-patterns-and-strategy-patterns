// import java.security.Principal;
public class MachineTes {

    public static void main(String[] args){
        Machine machine = new Machine();
        ArahTitikGps arah = new ArahTitikGps("111","barat");

        System.out.println("test DEFAULT \n");
        System.out.println(machine);
        System.out.println("Status internet : "+machine.internetConnection);
        System.out.println("Status gps : "+machine.gpsConnection);
        System.out.println("==============================================");
        
        //tes OnCam
        System.out.println("test OnCam \n");
        machine.turnOn();
        System.out.println("Status internet : "+machine.internetConnection);
        System.out.println("Status gps : "+machine.gpsConnection);
        System.out.println("==============================================");
        
        //tes NoInternetState
        System.out.println("test NoInternetState \n");
        machine.noInternet();
        System.out.println("Status internet: "+machine.internetConnection);
        //gps masih ON karena masih ikut keadaan onCam
        System.out.println("Status gps: "+machine.gpsConnection);
        System.out.println();
        System.out.println("==============================================");
        //tes NoGps
        System.out.println("test NoGps \n");
        machine.noGps();
        System.out.println("Status gps: "+machine.gpsConnection);
        //internet off karena ikut tes NoInternetState
        System.out.println("Status internet: "+machine.internetConnection);
        System.out.println("==============================================");
        //tes Hidupkan lagi
       
        System.out.println("test Restart \n");
        machine.turnOn();
        System.out.println("Status internet : "+machine.internetConnection);
        System.out.println("Status gps : "+machine.gpsConnection);
        System.out.println("==============================================");
        
        
        machine.cekLokasi(arah);
        machine.tampil(arah);
    }
}