package programs.designPattern._solidDesignPrinciple.interfaceSegregationPrinciple;

// Bad Example (violates ISP)
/*interface MultifunctionalDevice {
    void print();
    void scan();
    void fax();
}
class Printer implements MultifunctionalDevice {
    // ...
}
class Scanner implements MultifunctionalDevice {
    // ...
}*/

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class PrinterImpl implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

class ScannerImpl implements Scanner {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

public class ISPExample {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        printer.print();

        Scanner scanner = new ScannerImpl();
        scanner.scan();
    }
}
