package colorcoder;

public class PairColorCodeMain {
    public static void testNumberToPair(int pairNumber, MajorColor.Color expectedMajor, MinorColor.Color expectedMinor) {
        ColorPair colorPair = ColorUtil.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair);
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(MajorColor.Color major, MinorColor.Color minor, int expectedPairNumber) {
        int pairNumber = ColorUtil.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.Color.WHITE, MinorColor.Color.BROWN);
        testNumberToPair(5, MajorColor.Color.WHITE, MinorColor.Color.SLATE);

        testPairToNumber(MajorColor.Color.BLACK, MinorColor.Color.ORANGE, 12);
        testPairToNumber(MajorColor.Color.VIOLET, MinorColor.Color.SLATE, 25);
    }
}
