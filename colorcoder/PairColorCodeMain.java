package colorcoder;

public class PairColorCodeMain {
    public static ColorPair numberToPair(int pairNumber, MajorColor.Color expectedMajor, MinorColor.Color expectedMinor) {
        ColorPair colorPair = ColorUtil.getColorFromPairNumber(pairNumber);
           return colorPair;
    }

    public static int pairToNumber(MajorColor.Color major, MinorColor.Color minor, int expectedPairNumber) {
        int pairNumber = ColorUtil.getPairNumberFromColor(major, minor);
         return pairNumber;
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

    public static void main(String[] args) {
        generateColorCodeManual();
    }
    
}
