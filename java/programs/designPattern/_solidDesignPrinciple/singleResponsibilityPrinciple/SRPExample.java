package programs.designPattern._solidDesignPrinciple.singleResponsibilityPrinciple;

// Bad Example (violates SRP)
/*class User {
    private String name;
    private String email;
    private String password;

    public void register() {
        // ... registration logic ...
    }

    public void sendEmail() {
        // ... send welcome email logic ...
    }
}*/

class User {
    private final String name;
    private final String email;
    private final String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void register() {
        System.out.println("User registered successfully.");
    }
}

class EmailSender {
    public void sendWelcomeEmail(User user) {
        System.out.println("Welcome email sent to " + user.getEmail());
    }
}

public class SRPExample {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        user.register();

        EmailSender emailSender = new EmailSender();
        emailSender.sendWelcomeEmail(user);
    }
}