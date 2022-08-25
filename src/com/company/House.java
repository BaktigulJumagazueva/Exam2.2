package com.company;

public abstract class House {

    private int id;
    private String name;
    private String address;
    private int year;
    private int price;
   private String Person;

    public House(int id, String name, String address, int year, int price, String person) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.year = year;
        this.price = price;
        this.Person = person;
       if (name.contains("robmwh")){
           System.out.println();
       }else {
           System.out.println("Уй кабыл алынбайт биздин шарт боюнча болсун");
       }
       if (price>70000){
           System.out.println();
       }else {
           System.out.println("Баасы туура келбейт");
       }
       if (year>2015){
           System.out.println();
       }else {
           System.out.println("Сиздин уйунуз эски");
       }



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPerson() {
        return Person;
    }

    public void setPerson(String person) {
        Person = person;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +"\n"+
                " name='" + name + '\'' +"\n"+
                "address='" + address + '\'' +"\n"+
                "year=" + year +"\n"+
                "price=" + price +"\n"+
                "Person='" + Person + '\'' +"\n"+
                '}';
    }

    public abstract  void city();
    public abstract void electricity();

}
