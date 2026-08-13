package oops;

public class SocialMediaUser {
    int userId;
    String username;
    String password;
    String email;
    long userPhNo;
    boolean isUsernameExists(String givenUsername) {
        return false;
    }

    void signup(int userid, String username, String password,
                String email, long userPhNo) {

        this.userId = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userPhNo = userPhNo;

        System.out.println("Signup successful");
    }

    public static void main(String[] args) {

        SocialMediaUser user = new SocialMediaUser();

        user.signup(101, "Sutharshini", "12345",
                    "sutharshini@gmail.com", 9876543210L);

        System.out.println("User ID: " + user.userId);
        System.out.println("Username: " + user.username);
        System.out.println("Email: " + user.email);
        System.out.println("Phone: " + user.userPhNo);
    }
}