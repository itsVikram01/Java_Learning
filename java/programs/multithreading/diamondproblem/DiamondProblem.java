package programs.multithreading.diamondproblem;

interface A {
    default void display() {
        System.out.println("A's display");
    }
}

interface B {
    default void display() {
        System.out.println("B's display");
    }
}

class DiamondProblem implements A, B { // diamond problem
    // Resolving the diamond problem conflict
    @Override
    public void display() {
        // Option 1: Choose A's implementation:
        A.super.display();

        // Option 2: Choose B's implementation:
        //B.super.display();

        // Option 3: Or combine both implementations:
        //A.super.display();
        //B.super.display();

        System.out.println("DiamondProblem's resolver display");
    }
    public static void main(String[] args) {
        DiamondProblem obj = new DiamondProblem();
        obj.display();
    }
}
