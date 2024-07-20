package colorcoder;

public class MajorColor {
    public enum Color implements ColorUtil.Color {
        WHITE(0, "White"),
        RED(1, "Red"),
        BLACK(2, "Black"),
        YELLOW(3, "Yellow"),
        VIOLET(4, "Violet");

        private final int index;
        private final String name;

        Color(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
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
