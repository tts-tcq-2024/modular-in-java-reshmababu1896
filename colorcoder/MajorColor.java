package colorcoder;

public class MajorColor {
    public enum Color {
        WHITE(0),
        RED(1),
        BLACK(2),
        YELLOW(3),
        VIOLET(4);

        private int index;

        private Color(int index) {
            this.index = index;
        }

        int getIndex() {
            return index;
        }
        
    

    public static final String[] NAMES = {
            "White", "Red", "Black", "Yellow", "Violet"
    };

    public static final int COUNT = NAMES.length;

    public static MajorColor fromIndex(int index) {
        return ColorUtil.fromIndex(values, index);
    }     
}
