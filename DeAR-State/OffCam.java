public class OffCam implements State {

    private Machine machine;

    public OffCam(Machine machine){
        this.machine = machine;
        this.machine.internetConnection = false;
        this.machine.gpsConnection = false;
    }

    @Override
    public void turnOn() {
        System.out.println("You turn on the camera dari OffCam");
        System.out.println("Camera is ON");
        this.machine.internetConnection = true;
        this.machine.gpsConnection = true;
    }

    @Override
    public void turnOff() {
        //System.out.println("Camera is off DARI OFF CAM");
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
        System.out.println("Mohon maaf, kamera anda mati");
    }

    public String toString() {
        return " Off";
    }
    
}
