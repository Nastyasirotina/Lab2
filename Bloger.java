package ru.mirea.lab2;

public class Bloger extends Author{
    private String chanel;

    public Bloger(String n, String email, char gender, String chanel) {
        super(n, email, gender);
        this.chanel = chanel;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    @Override
    public String toString() {
        return "Bloger{" +
                "chanel='" + chanel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
