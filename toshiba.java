public class Toshiba implements Laptop {
    private int volume;
    private boolean isOn;

    public Toshiba() {
        this.volume = 40;
        this.isOn = false;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Laptop Toshiba menyala...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Laptop Toshiba mati.");
    }

    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 5;
            System.out.println("Volume Toshiba: " + volume);
        }
    }

    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 5;
            System.out.println("Volume Toshiba: " + volume);
        }
    }
}
