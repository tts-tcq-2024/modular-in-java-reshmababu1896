package colorcoder;

public class ColorUtil {
    private final int index;
    private final String name;
    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor.Color majorColor = MajorColor.Color.fromIndex(zeroBasedPairNumber / MinorColor.COUNT);
        MinorColor.Color minorColor = MinorColor.Color.fromIndex(zeroBasedPairNumber % MinorColor.COUNT);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor.Color major, MinorColor.Color minor) {
        return major.getIndex() * MinorColor.COUNT + minor.getIndex() + 1;
    }

    protected ColorUtil(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return name;
    }

    public static <E extends Color> E fromIndex(E[] values, int index) {
        for (E color : values) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }

    //  public static String generateReferenceManual() {
    //     StringBuilder manual = new StringBuilder();
    //     manual.append("Color Code Reference Manual\n");
    //     manual.append("Pair Number | Major Color | Minor Color\n");
    //     manual.append("---------------------------------------\n");

    //     int pairNumber = 1;
    //     for (MajorColor major : MajorColor.values()) {
    //         for (MinorColor minor : MinorColor.values()) {
    //             manual.append(String.format("%-11d| %-11s| %-11s\n", pairNumber, major, minor));
    //             pairNumber++;
    //         }
    //     }
    //     return manual.toString();
    // }
}
