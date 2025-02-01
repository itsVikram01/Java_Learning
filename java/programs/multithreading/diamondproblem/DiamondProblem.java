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
    public static void main(String[] args) {
        DiamondProblem obj = new DiamondProblem();
        obj.display();
    }

    // Resolving the diamond problem conflict
    @Override
    public void display() {
        //A.super.display();
        //B.super.display();
        System.out.println("DiamondProblem's resolver display");
    }

}
