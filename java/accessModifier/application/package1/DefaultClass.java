package accessModifier.application.package1;

// Allowed: Default (package-private) class - Accessible only within the same package
class DefaultClass {

    int defaultVar = 100; // ✅ Accessible within the same package
    public int publicVar = 200; // ✅ Accessible everywhere
    protected int protectedVar = 300; // ✅ Accessible in package and subclasses
    private int privateVar = 400; // ✅ Accessible only in this class


    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }
    public void publicMethod() { // ✅ Accessible everywhere
        System.out.println("Public Method");
    }
    protected void protectedMethod() { // ✅ Accessible in package and subclasses
        System.out.println("Protected Method");
    }
    private void privateMethod() { // ✅ Accessible only in this class
        System.out.println("This is a private method.");
    }


    public void accessDefault() { // ✅ Accessing default in same class (indirect access via public method)
        System.out.println("defaultVar : "+defaultVar); // ✅ Accessing within the same class
        defaultMethod();  // ✅ Accessing within the same class
    }
    public void accessPublic() { // ✅ Accessing public in same class (indirect access via public method)
        System.out.println("publicVar : "+publicVar); // ✅ Accessing within the same class
        publicMethod();  // ✅ Accessing within the same class
    }
    public void accessProtected() { // ✅ Accessing protected in same class (indirect access via public method)
        System.out.println("protectedVar : "+protectedVar); // ✅ Accessing within the same class
        protectedMethod();  // ✅ Accessing within the same class
    }
    public void accessPrivate() { // ✅ Accessing private in same class (indirect access via public method)
        System.out.println(privateVar);  // ✅ Accessing within the same class
        privateMethod();  // ✅ Accessing within the same class
    }

}
