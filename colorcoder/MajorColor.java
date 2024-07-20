package colorcoder;

public class MajorColor {
    public enum Color implements ColorUtil.Color {
        WHITE(0),
        RED(1),
        BLACK(2),
        YELLOW(3),
        VIOLET(4);

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
            "White", "Red", "Black", "Yellow", "Violet"
    };

    public static final int COUNT = NAMES.length;
}
