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

    int randomInt(int min, int max) { //min = 5 and max = 16
        return (int)
                (Math.random() * (max - min + 1) + min);
    }



    /*
     * Returns a random manager between 1 and 'max'
     */
    int randomInt(int max) {
        return randomInt(1, max);
    }

    /*
     * Returns a random integer between 1-11 (inclusive).
     * HINT: see a class called Math (in package java.lang) look for a helpful method here.
     * NOTE: these methods are all "static," which means you call them as follows:
     * Math.methodName()
     *
     */

    int randomInt(){
        return randomInt(1,11); //delegates to min-max version passing in 1 for min and 11 for max

//        int result = 0;
//
//        double rand = Math.random();        // 0.00    to  0.9999
//        double scaled = (rand * 11) + 1;      //1.0000 to  11.999
//        result = (int) scaled;              // explicit downcast from double to int
//
//        return result;
    }
}