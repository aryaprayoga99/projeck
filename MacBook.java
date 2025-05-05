public class MacBook implements Laptop {
    private int volume;
    private boolean isOn;

    public MacBook() {
        this.volume = 30;
        this.isOn = false;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("MacBook dinyalakan...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("MacBook dimatikan.");
    }

    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 15;
            System.out.println("Volume MacBook: " + volume);
        }
    }

    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 15;
            System.out.println("Volume MacBook: " + volume);
        }
    }
}
