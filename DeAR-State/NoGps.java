public class NoGps implements State{
    Machine machine;

    public NoGps(Machine machine){
        this.machine = machine;
        machine.gpsConnection = false;
    }

    @Override
    public void turnOn() {
        machine.setState(machine.getTurnOnCam());
        System.out.println("Camera is on already");

    }

    @Override
    public void turnOff() {
        System.out.println("You turn off the Camera");
        machine.setState(machine.getTurnOffCam());
    }
    
    @Override
    public void noInternet() {
        System.out.println("Internet is off");
    }

    @Override
    public void noGps() {
        System.out.println("Gps is off");
        machine.gpsConnection = false;
    }

    @Override
    public void tampil(ArahTitikGps arah){
        System.out.println("Mohon maaf, internet atau gps anda mati");
    }

    public void setGpsConnection(boolean status){
        machine.gpsConnection=status;
    }

    public String toString() {
        return " No gps Connection.";
    }

}
