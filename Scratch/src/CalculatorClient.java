class CalculatorClient {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = calc.add(1,3);//implicit upcast
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + calc.subtract(1.1,3.3));

        System.out.println("10 is even? " + calc.isEven(10));

        System.out.println();

        System.out.println("winner is: " + calc.randomInt());


        System.out.println(calc.randomInt(1,11)); //calls min max version

    }

}