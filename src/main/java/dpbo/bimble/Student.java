package app;


public class Student extends User {

    public Student(String userId, String username, String password, String role) {
        super(userId, username, password, role);
    }

    @Override
    public void login() {
        System.out.println("Student " + username + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student " + username + " has logged out.");
    }

    public void registrasi() {
        System.out.println("Registrasi student berhasil.");
        System.out.println("ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
    }
}
