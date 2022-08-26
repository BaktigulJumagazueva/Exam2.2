package com.company;
import java.util.Scanner;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String  phoneNumber;

    public Person(int id, String firstName, String lastName, String email, int age, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        if (age>100|| age<0){
            System.out.println("Терс сан берууго жана жок жаш берууго болбойт");
        }
        if(email.contains("@")){
            System.out.println(" ");
        }else {
            System.out.println("@ жок кайра текшериниз");
        }
        if(phoneNumber.contains("+996")){
            System.out.println(" ");
        }else {
            System.out.println("Кыргыз номер бериниз");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +"\n"+
                " firstName='" + firstName + '\'' +"\n"+
                " lastName='" + lastName + '\'' +"\n"+
                "email='" + email + '\'' +"\n"+
                " age=" + age +"\n"+
                " phoneNumber='" + phoneNumber + '\'' +"\n"+
                '}';
    }

    public void work(){
        Scanner scanner = new Scanner(System.in);
        firstName= scanner.nextLine();
        System.out.println(firstName+" Кайсы жумушта иштейт");

    }
    public void tameTable(){
        Scanner scanner = new Scanner(System.in);
        firstName= scanner.nextLine();
        System.out.println(firstName+"дын  бир жумалык графиги дуйшомбу (\"иштейт\");\n" +
                "            шейшемби(\" иштейт\");\n" +
                "            шаршемби(\" иштейт\");\n" +
                "            бейшемби(\" иштейт \");\n" +
                "            жума    (\" иштейт \");\n" +
                "            ишемби  (\" иштебейт\");\n" +
                "            жекшемби(\" иштебейт \");");

    }
}
