abstract class Device {

    String brand = "Samsung";

    abstract void turnOn();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

interface Camera {

    int MAX_ZOOM = 10;

    void takephotoaInfo();

    default void camerainfo() {
        System.out.println("Camera is ready");
    }
}

interface MusicPlayer {

    void playMusic();

    void stopMusic();

    default void musicInfo() {
        System.out.println("Music player is ready");
    }
}

class Smartphone extends Device implements Camera, MusicPlayer {

    @Override
    void turnOn() {
        System.out.println("Smartphone is turning on");
    }

    @Override
    public void takephotoaInfo() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped");
    }
}

public class DeviceDemo {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.turnOn();

        phone.showBrand();

        phone.takephotoaInfo();

        phone.camerainfo();

        System.out.println("Maximum Zoom: " + Camera.MAX_ZOOM);

        phone.playMusic();

        phone.stopMusic();

        phone.musicInfo();
    }
}