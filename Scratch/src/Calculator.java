class Calculator {

    double add(double a, double b) {
       return a + b;
    }


    double subtract(double a, double b) {
        return a - b;
    }

    boolean isEven(int a) {
        return a % 2 == 0;
    }


    /* Return a random integer between 'min' and 'max' (inclusive)
     *    TODO: implement this algorithm
     */

    int randomInt(int min, int max) {
        return 0;
    }

    /*
     * Returns a random integer between 1-11 (inclusive).
     * HINT: see a class called Math (in package java.lang) look for a helpful method here.
     * NOTE: these methods are all "static," which means you call them as follows:
     * Math.methodName()
     *
     */
    int randomInt(){
        int result =0;

        double rand = Math.random();
        double scaled = (rand * 11)+1;
        result = (int) scaled;

        return result;
    }

}