package first;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {

    }

    public ChocAmor(float length, String flavor, String origin) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume of" + this.getVolume();
    }
}
