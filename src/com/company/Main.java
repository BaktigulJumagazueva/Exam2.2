package com.company;

public class Main {
    public static void main(String[] args) {
        Person person= new Person(8374,"Alina","Nurlanova","NURLANOVA_@01gmail.com",29,String.valueOf("+99704411154"));
        System.out.println(person);
        person.work();
        person.tameTable();
    }
}