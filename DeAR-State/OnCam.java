public class OnCam implements State{

    Machine machine;

    public OnCam(Machine machine){
        this.machine = machine;
        this.machine.internetConnection = true;
        this.machine.gpsConnection = true;
    }

    @Override
    public void turnOn() {
        System.out.println("Camera is on already dari OnCam");
        machine.internetConnection = true;
        machine.gpsConnection = true;
    }

    @Override
    public void turnOff() {
        System.out.println("You turn off the camera DARI ON CAM");
        System.out.println("Internet connection is OFF");
        System.out.println("Camera is OFF");
        this.machine.internetConnection = false;
        this.machine.gpsConnection = false;
    }

    @Override
    public void noInternet() {
        System.out.println("Internet is off");
    }

    @Override
    public void noGps() {
        System.out.println("Gps is off");
    }
    @Override
    public void tampil(ArahTitikGps arah){
        if (machine.gpsConnection == true && machine.internetConnection == true) {
            System.out.println("Kiri  :"+arah.getKiri());
            System.out.println("Depan :"+arah.getDepan());
            System.out.println("Kanan :"+arah.getKanan());
        }else{
            System.out.println("Mohon maaf, internet atau gps anda mati");
        }
    }

    public String toString() {
        return " Camera is ON";
    }
}
