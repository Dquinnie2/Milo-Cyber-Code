public class Calculator.java {

    public int addition(String arguments) {

        int sum = 0;
        for (String add : arguments.split("\\+"))
            sum += Integer.valueOf(add);
            return sum;
    }
}