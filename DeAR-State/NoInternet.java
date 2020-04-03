public class NoInternet implements State{
    Machine machine;

    public NoInternet(Machine machine){
        this.machine = machine;
        machine.internetConnection = false;
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
        machine.internetConnection = false;
    }

    @Override
    public void noGps() {
        System.out.println("Gps is off");
    }
    @Override
    public void tampil(ArahTitikGps arah){
        System.out.println("Mohon maaf, internet atau gps anda mati");
    }

    public void setInternetConnection(boolean status){
        machine.internetConnection=status;
    }

    public String toString() {
        return " No internet Connection. Feature get Direction is deactived.";
    }

}
