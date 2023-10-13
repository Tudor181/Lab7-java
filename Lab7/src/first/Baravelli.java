package first;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {

    }

    public Baravelli(float radius, float height, String flavour, String origin) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return super.toString() + " Has volume of " + this.getVolume();
    }

}
