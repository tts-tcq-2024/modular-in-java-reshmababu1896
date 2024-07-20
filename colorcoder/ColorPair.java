package colorcoder;

public class ColorPair {
    private MajorColor.Color majorColor;
    private MinorColor.Color minorColor;

    public ColorPair(MajorColor.Color major, MinorColor.Color minor) {
        this.majorColor = major;
        this.minorColor = minor;
    }

    public MajorColor.Color getMajor() {
        return majorColor;
    }

    public MinorColor.Color getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return MajorColor.NAMES[majorColor.getIndex()] + " " + MinorColor.NAMES[minorColor.getIndex()];
    }
}
