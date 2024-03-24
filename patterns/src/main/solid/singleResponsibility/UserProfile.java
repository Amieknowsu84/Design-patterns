package main.solid.singleResponsibility;

// User class responsible for user profile management
class UserProfile {
    private final String username;
    private final String password;

    public UserProfile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Methods related to user profile management
    public void updateProfile() {
        // Code to update user profile in the database
        System.out.println("Update Profile");
    }

    public void viewProfile() {
        // Code to view user profile
        System.out.println("view Profile");
    }
}
