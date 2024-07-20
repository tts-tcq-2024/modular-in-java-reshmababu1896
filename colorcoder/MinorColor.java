package colorcoder;

public class MinorColor {
    public enum Color implements ColorUtil.Color {
        BLUE(0),
        ORANGE(1),
        GREEN(2),
        BROWN(3),
        SLATE(4);

        private final int index;

        Color(int index) {
            this.index = index;
        }

        @Override
        public int getIndex() {
            return index;
        }

        public static Color fromIndex(int index) {
            return (Color) ColorUtil.fromIndex(index, Color.values());
        }
    }

    public static final String[] NAMES = {
            "Blue", "Orange", "Green", "Brown", "Slate"
    };

    public static final int COUNT = NAMES.length;
}
