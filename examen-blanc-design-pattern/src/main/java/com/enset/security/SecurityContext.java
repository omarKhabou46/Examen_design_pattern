package com.enset.security;

public class SecurityContext {
    private String username;
    private String password;
    private String[] roles;

    public SecurityContext(String username, String password, String[] roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public boolean isAuthenticated() {
        return username.equals("omar") && password.equals("omar");
    }

    public String[] getRoles() {
        return roles;
    }

    public boolean exist(String role) {
        for (String r : roles) {
            if (role.equals(r)) return true;
        }
        return false;
    }
}
