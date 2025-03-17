package accessModifier.application.package1;


public class Package1Class {
    public static void main(String[] args) {
        PublicClass publicObj = new PublicClass();

        System.out.println(publicObj.defaultVar);  // ✅ Accessing within same package
        System.out.println(publicObj.publicVar);  // ✅ Accessing within same package
        System.out.println(publicObj.protectedVar);  // ✅ Accessing within same package
        //System.out.println(publicObj.privateVar);  // ❌ Not Allowed (outside class)


        publicObj.defaultMethod();  // ✅ Accessing within same package
        publicObj.publicMethod();  // ✅ Accessing within same package
        publicObj.protectedMethod();  // ✅ Accessing within same package
        //publicObj.privateMethod();  // ❌ Not Allowed (private outside class)

        publicObj.accessDefault(); // ✅ Accessing default in same package but outside class (indirect access via public method)
        publicObj.accessPublic(); // ✅ Accessing public in same package but outside class (indirect access via public method)
        publicObj.accessProtected(); // ✅ Accessing protected in same package but outside class (indirect access via public method)
        publicObj.accessPrivate(); // ✅ Accessing private in same package but outside class (indirect access via public method)



    }
}
