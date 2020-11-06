package ru.mirea.lab2;

public class Author {
    protected String name;
    private String email;
    private char gender;

    public Author(String n, String email, char gender) {
        //this.name = name;
        name = n;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) {this.email = email;}

    public char getGender () { return gender; }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
