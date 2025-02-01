package programs.num.add;

public class AddTwoVariableUsingTemp {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("input a = " + a);
        int b = 20;
        System.out.println("input b = " + b);

        int temp = a;
        System.out.println("temp = " + temp);

        a = b;
        System.out.println("output a = " + a);
        b = temp;
        System.out.println("output b = " + b);

    }
}
