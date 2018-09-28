package com.example.fgw.sahayeadmin;

class Users {
    String email;
    String UserID;
    String Organization;

    public Users(String email, String userID, String organization) {
        this.email = email;
        UserID = userID;
        Organization = organization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }
}
