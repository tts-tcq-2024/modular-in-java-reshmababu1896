package colorcoder;

public class PairColorCodeMain {
    public static colorPair numberToPair(int pairNumber, MajorColor.Color expectedMajor, MinorColor.Color expectedMinor) {
        ColorPair colorPair = ColorUtil.getColorFromPairNumber(pairNumber);
       return colorpair;
        // assert(colorPair.getMajor() == expectedMajor);
        // assert(colorPair.getMinor() == expectedMinor);
    }

    public static int pairToNumber(MajorColor.Color major, MinorColor.Color minor, int expectedPairNumber) {
        int pairNumber = ColorUtil.getPairNumberFromColor(major, minor);
     return pairNumber;
        // assert(pairNumber == expectedPairNumber);
    }
    public static void generateColorCodeManual(){
        MajorColor.Color[] majorColors = MajorColor.Color.values();
        MinorColor.Color[] minorColors = MinorColor.Color.values();

        String referenceManual = ColorUtil.generateReferenceManual(majorColors, minorColors);
        printManual(referenceManual);
    }
    private static void printManual(String referenceManual){
       System.out.println(referenceManual);  
    }
    
    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        generateColorCodeManual();
        // testNumberToPair(4, MajorColor.Color.WHITE, MinorColor.Color.BROWN);
        // testNumberToPair(5, MajorColor.Color.WHITE, MinorColor.Color.SLATE);

        // testPairToNumber(MajorColor.Color.BLACK, MinorColor.Color.ORANGE, 12);
        // testPairToNumber(MajorColor.Color.VIOLET, MinorColor.Color.SLATE, 25);


        
    }
    
}
