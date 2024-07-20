package colorcoder;

public class ColorUtil {
    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor.Color majorColor = MajorColor.Color.fromIndex(zeroBasedPairNumber / MinorColor.COUNT);
        MinorColor.Color minorColor = MinorColor.Color.fromIndex(zeroBasedPairNumber % MinorColor.COUNT);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor.Color major, MinorColor.Color minor) {
        return major.getIndex() * MinorColor.COUNT + minor.getIndex() + 1;
    }

    public static int getIndex(Color color) {
        return color.getIndex();
    }

    public static Color fromIndex(int index, Color[] colors) {
        for (Color color : colors) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }

    public interface Color {
        int getIndex();
    }
}
