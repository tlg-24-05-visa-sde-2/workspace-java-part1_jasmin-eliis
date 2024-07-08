package ai.calc;

class CalculatorClient {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = Calculator.add(1,3);//implicit upcast
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1,3.3));

        System.out.println("10 is even? " + Calculator.isEven(10));
        System.out.println();

        System.out.println("winner is: " + Calculator.randomInt(5,16));
        System.out.println();

        System.out.println( "average is: " + Calculator.average(3,4,9,2,3));
        System.out.println();

        System.out.println("average of 12 : " + Calculator.average(12));
        System.out.println();

        System.out.println(Calculator.randomInt(1,11)); //calls min max version

    }

}