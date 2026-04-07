package ro.ulbs.proiectaresoftware.lab5;




public class AppLab5 {
    public static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();

        AdvancedCalculator advCalc = new AdvancedCalculator(64);

        int advResult = advCalc.nthRoot(3)
                .add(6)
                .divide(2)
                .power(2)
                .result();
        System.out.println("result: " + advResult);


    }




}



