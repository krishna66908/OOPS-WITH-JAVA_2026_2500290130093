abstract class Device {
    String brand = "Samsung";
    abstract void turnOn();
    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
interface Camera {
    int MAX_ZOOM = 10;
    void takephotoaInfo();
    default void camerainfo(){
        System.out.println("Camera is ready");
        
    }
}

interface MusicPlayer {
    
}