package main.solid.singleResponsibility;

class User {
    private String username;
    private String password;

    // Methods related to user management
    public void createUser() {
        // Code to create a new user in the database
    }

    public void deleteUser() {
        // Code to delete a user from the database
    }

    // Methods related to user authentication
    public boolean authenticate(String username, String password) {
        // Code to authenticate a user
        return true; // Dummy implementation
    }

    // Methods related to user profile management
    public void updateProfile() {
        // Code to update user profile in the database
    }

    public void viewProfile() {
        // Code to view user profile
    }
}

