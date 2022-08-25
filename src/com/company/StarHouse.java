package com.company;

public class StarHouse extends House{
    public StarHouse(int id, String name, String address, int year, int price, String person) {
        super(id, name, address, year, price, person);
    }
    @Override
    public  void city(){
        System.out.println(" Баткен шаарында жайгашкан ");
    }
    public void electricity(){
        System.out.println("Айына 60000 сом толонот");
    }
}
