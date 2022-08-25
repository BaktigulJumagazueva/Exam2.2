package com.company;

public class CrazyHouse extends House{
    public CrazyHouse(int id, String name, String address, int year, int price, String person) {
        super(id, name, address, year, price,person);
    }
    @Override
    public  void city(){
        System.out.println(" Бишкек шаарында жайгашкан ");
    }
    public void electricity(){
        System.out.println("Айына 6000 сом толонот");
    }
}
