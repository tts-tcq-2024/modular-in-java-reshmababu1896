package colorcoder;

public class MinorColor {
    public enum Color implements ColorUtil.Color {
        BLUE(0, "Blue"),
        ORANGE(1, "Orange"),
        GREEN(2, "Green"),
        BROWN(3, "Brown"),
        SLATE(4, "Slate");

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
            "Blue", "Orange", "Green", "Brown", "Slate"
    };

    public static final int COUNT = NAMES.length;
}
