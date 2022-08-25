package com.company;

public class FashTeamHouse extends House{
    public FashTeamHouse(int id, String name, String address, int year, int price, String person) {
        super(id, name, address, year, price, person);
    }
    @Override
    public  void city(){
        System.out.println(" Ош шаарында жайгашкан ");
    }
    public void electricity(){
        System.out.println("Айына 10000 сом толонот");
    }
}
