public class ProductPricing {
    public static void main(String[] args) {
        testPricing(-5, 3.4, 3, 0);
        testPricing(-5, -5, 0, 0);
        testPricing(1.0234, 3.456, 0, 6.991);
        Out.println("the last test was with expected cost 6.991 and the visual cut is on 2 decimal places.\n");
    }
    static void testPricing ( double materialCost , double manufactoringCost , double expectedCostPrice , double expectedSalesPrice ) {
        Out.println(" Testing   calcCostPrice (%.2f, %.2f):".formatted( materialCost , manufactoringCost ));

        double actualCostPrice = calcCostPrice( materialCost , manufactoringCost );

        Out.println("  Result : %.2f".formatted(actualCostPrice));

        // Due to floating - point imprecision
        if(Math.abs( actualCostPrice - expectedCostPrice ) < 0.0001){
            Out.println("  SUCCESS :  Result   matches   expected   result ");
        } else {
            Out.println("  ERROR :  Result   does   not   match   expected   result   %.2f".formatted( expectedCostPrice ));
        }

        Out.println(" Testing   calcSalesPrice (%.2f,  %.2f):".formatted(materialCost, manufactoringCost));

        double actualSalesPrice = calcSalesPrice(materialCost , manufactoringCost);

        Out.println("  Result : %.2f".formatted(actualSalesPrice));

        // Due to floating - point imprecision
        if(Math.abs(actualSalesPrice - expectedSalesPrice) < 0.0001){
            Out.println("  SUCCESS :  Result   matches   expected   result ");
        }else{
            Out.println("  ERROR :  Result   does   not   match   expected   result   %.2f".formatted(expectedSalesPrice));
        }
        Out.println();
    }        
    static double calcCostPrice(double materialCost, double manufacturingCost){
        if(materialCost < 0 || manufacturingCost < 0){
            return 0;
        }
        return (materialCost + manufacturingCost)*1.2;
    }

    static double calcSalesPrice(double materialCost, double manufacturingCost){
        return calcCostPrice(materialCost, manufacturingCost)*1.3; // 0 * 1.3 = 0
    }
}
