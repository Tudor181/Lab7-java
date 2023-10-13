package first;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {

    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{flavor=" + flavor + "; origin=" + origin + "}";
    }

    public boolean equivalence(Object obj) {
        if (obj instanceof CandyBox) {
            CandyBox obj2 = (CandyBox) obj;
            return flavor == obj2.flavor && origin == obj2.origin;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
