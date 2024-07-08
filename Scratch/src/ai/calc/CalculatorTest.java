package ai.calc;

class CalculatorTest {

    public static void main(String[] args) {
        boolean isCorrect = true;

        //call randomInt 100_000_000 times and check the result each time
        //if it is <5 or >16, its not right, bail and show the result
        int min = 5;
        int max = 16;


        for (int i = 0; i < 100_000_000; i++) {
            int random = Calculator.randomInt(min, max);

            if (random < min || random > max) { //we have a problem....
                isCorrect = false;
                break;
            }
        }
        if (isCorrect) {
            System.out.println("it works!!");
        } else {
            System.out.println("its broken");
        }

    }
}