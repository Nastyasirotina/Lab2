package ru.mirea.lab2;

public class High_student extends Student {
    protected String group;

    public High_student(String name, int age, String number, String group) {
        super(name, age, number);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "High_student{" +
                "group='" + group + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void say(){
        System.out.println("Здравствуйте,И.П.!");

    }
}
