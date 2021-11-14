package blatt06;

class Test {

    // singleton instance
    private static Test instance = null;

    // array of numbers
    private int[] numbers;

    // create main method
    public static void main(String[] args) {
        // initialize instance
        instance = new Test();

        // call method
        instance.test();
    }

    // test method
    public void test() {
        // initialize array
        numbers = new int[10];

        // fill array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        // call method
        test2();
    }

    // test2 method that sorts the array
    public void test2() {
        // call method
        sort(numbers);
    }

    // implement sort method using bublble sort
    public void sort(int[] array) {
        // loop through array
        for (int i = 0; i < array.length; i++) {
            // loop through array again
            for (int j = 0; j < array.length; j++) {
                // if array[i] is smaller than array[j]
                if (array[i] < array[j]) {
                    // swap array[i] and array[j]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
