package colorcoder;

public class ColorUtil {

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

    public static String generateReferenceManual(Color[] majorColors, Color[] minorColors) {
        StringBuilder manual = new StringBuilder();
        manual.append("Reference Manual for Wiring Personnel\n");
        manual.append("Major Colors:\n");
        for (Color color : majorColors) {
            manual.append(String.format("%d - %s\n", color.getIndex(), color.getName()));
        }
        manual.append("\nMinor Colors:\n");
        for (Color color : minorColors) {
            manual.append(String.format("%d - %s\n", color.getIndex(), color.getName()));
        }
        return manual.toString();
    }

    public interface Color {
        int getIndex();
        String getName();
    }
}
