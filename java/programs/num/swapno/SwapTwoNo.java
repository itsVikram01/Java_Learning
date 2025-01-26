package num.swapno;

public class SwapTwoNo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

        swapUsingTemp(num1, num2);

        swapUsingThirdVariable(num1, num2);

        swapWithoutUsingThirdVariable(num1, num2);

    }

    private static void swapUsingTemp(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap UsingTemp : num1 = " + num1 + ", num2 = " + num2);
    }

    private static void swapUsingThirdVariable(int num1, int num2) {
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After swap UsingThirdVariable : num1 = " + num1 + ", num2 = " + num2);
    }

    public static void swapWithoutUsingThirdVariable(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap WithoutUsingThirdVariable : num1 = " + num1 + ", num2 = " + num2);
    }
}
