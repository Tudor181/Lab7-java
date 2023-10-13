package first;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {

    }

    public Lindt(float length, float width, float height, String flavor, String origin) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume of" + this.getVolume();
    }
}
