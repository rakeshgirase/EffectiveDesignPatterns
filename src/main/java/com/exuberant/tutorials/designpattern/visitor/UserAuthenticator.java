package com.exuberant.tutorials.designpattern.visitor;

public class UserAuthenticator {


    public boolean isValidUser(String username, String password) throws InvalidUsernamePasswordException {
        throw new InvalidUsernamePasswordException("Invalid User!!");
    }

    private void redirectThemToSingupPage() {
    }
}
