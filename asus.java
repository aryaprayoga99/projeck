public class ASUS implements Laptop {
    private int volume;
    private boolean isOn;

    public ASUS() {
        this.volume = 50;
        this.isOn = false;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Laptop ASUS menyala...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Laptop ASUS mati.");
    }

    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 10;
            System.out.println("Volume ASUS: " + volume);
        }
    }

    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 10;
            System.out.println("Volume ASUS: " + volume);
        }
    }
}
