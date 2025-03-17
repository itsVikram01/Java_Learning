package accessModifier.application;

import accessModifier.application.package1.PublicClass;

public class ApplicationClass{
    public static void main(String[] args) {
        PublicClass publicObj = new PublicClass();

        //System.out.println(publicObj.defaultVar);  // ❌ Not Allowed (default outside package)
        System.out.println(publicObj.publicVar);  // ✅ Accessing outside package
        //System.out.println(publicObj.protectedVar);  // ✅ Accessing within same package
        //System.out.println(publicObj.privateVar);  // ❌ Not Allowed (outside class)


        //publicObj.defaultMethod();  // ❌ Not Allowed (default outside package)
        publicObj.publicMethod();  // ✅ Accessing outside package
        //publicObj.protectedMethod();  // ❌ Not Allowed (protected outside package)
        //publicObj.privateMethod();  // ❌ Not Allowed (private outside class)

        publicObj.accessDefault(); // ✅ Accessing default in same package but outside class (indirect access via public method)
        publicObj.accessPublic(); // ✅ Accessing public in same package but outside class (indirect access via public method)
        publicObj.accessProtected(); // ✅ Accessing protected in same package but outside class (indirect access via public method)
        publicObj.accessPrivate(); // ✅ Accessing private in same package but outside class (indirect access via public method)



    }
}
