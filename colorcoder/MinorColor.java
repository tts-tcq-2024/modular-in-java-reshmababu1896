package colorcoder;

public class MinorColor {
    public enum Color {
        BLUE(0),
        ORANGE(1),
        GREEN(2),
        BROWN(3),
        SLATE(4);

        private int index;

        private Color(int index) {
            this.index = index;
        }

        int getIndex() {
            return index;
        }

    //     public static Color fromIndex(int index) {
    //         for (Color color : Color.values()) {
    //             if (color.getIndex() == index) {
    //                 return color;
    //             }
    //         }
    //         return null;
    //     }
    // }

     public static MinorColor fromIndex(int index) {
        return Color.fromIndex(values, index);
    }

    public static final String[] NAMES = {
            "Blue", "Orange", "Green", "Brown", "Slate"
    };

    public static final int COUNT = NAMES.length;
}
