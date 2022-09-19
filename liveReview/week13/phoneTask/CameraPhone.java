package week13.phoneTask;

public class CameraPhone extends Phone{

    int imageSize; // this one is in MegaBytes
    int memorySize; // this is in gigabytes

    public CameraPhone(String make, String model, double price, int imageSize, int memorySize) {
        super(make, model, price);
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return imageSize * 1000 / imageSize;
    }
}
