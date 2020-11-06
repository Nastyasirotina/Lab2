package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Анастасия Андреевна", "sirotina.nastya2000@gmail.com", 'Ж' );
        System.out.println(a1);
        Bloger b1 = new Bloger("nastya", "sirotina.nastya2000@yandex.ru", 'Ж', "nastya_pavlikk");
        System.out.println(b1);
        Student name = new Student("Настя Сиротина", 20, "123456");
        name.say();
        High_student high_student = new High_student("Настя",20, "65432", "gibo-03-18");
        high_student.say();
    }
}
