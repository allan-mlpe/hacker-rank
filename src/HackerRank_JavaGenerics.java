import java.lang.reflect.Method;

public class HackerRank_JavaGenerics {

    static class Printer {

        // method receiving generic array
        public <T> void printArray(T[] array) {
            for(T item : array) {
                System.out.println(item.toString());
            }
        }
    }

    // default main method from Hacker Rank problem
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
