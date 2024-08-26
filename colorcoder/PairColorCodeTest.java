package colorcoder;

public class PairColorCodeTest {
    PairColorCodeMain pairColorCodeMain=new PairColorCodeMain();

    public static void testNumberToPairColorBrown() {
        ColorPair colorPair=pairColorCodeMain.numberToPair(4, MajorColor.Color.WHITE, MinorColor.Color.BROWN);
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }
    public static void testNumberToPairColorSlate() {
        ColorPair colorPair=pairColorCodeMain.numberToPair(5, MajorColor.Color.WHITE, MinorColor.Color.SLATE);
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }
    public static void testPairToNumber12() {
        int pairNumber= pairColorCodeMain.pairToNumber(MajorColor.Color.BLACK, MinorColor.Color.ORANGE, 12);
        assert(pairNumber == expectedPairNumber);
    }

    public static void testPairToNumber12() {
        int pairNumber= pairColorCodeMain.pairToNumber(MajorColor.Color.VIOLET, MinorColor.Color.SLATE, 25);
        assert(pairNumber == expectedPairNumber);
    }

}
