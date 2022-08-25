package com.company;

public class VipHouse extends House{
    public VipHouse(int id, String name, String address, int year, int price, String person) {
        super(id, name, address, year, price, person);
    }
    @Override
    public  void city(){
        System.out.println(" Талас шаарында жайгашкан ");
    }
    public void electricity(){
        System.out.println("Айына 1000000 сом толонот");
    }
}
