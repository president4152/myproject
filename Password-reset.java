public class PasswordReset {
    public static void resetPassword(String email) {
        System.out.println("Password reset link sent to: " + email);
    }

    public static void main(String[] args) {
        resetPassword("hammad@email.com");
    }
}