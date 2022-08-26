package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person= new Person(8374,"Alina","Nurlanova","NURLANOVA_@01gmail.com",29,String.valueOf("+99604411154"));
        Person person1= new Person(1233,"Murat","Nurlanov","NURLANOV_@01gmail.com",20,String.valueOf("+99604419854"));
        Person person2= new Person(5434,"Malika","Tagaeva","TAGAEVA..@01gmail.com",52,String.valueOf("+99604411154"));
        Person person3= new Person(4355,"Alina","Aliev","ALIEV@gmail.com",24,String.valueOf("+99604411154"));
        Person person4= new Person(1254,"Dinara","Kirova","KIROVA@gmail.com",28,String.valueOf("+99604411154"));
        Person person5= new Person(7655,"Cacha","Malev","MALEV@gmail.com",25,String.valueOf("+99604411154"));
        Person person6= new Person(9687,"Kerim","Akunov","AKUNOV_@gmail.com",24,String.valueOf("+99604411154"));
        Person person7= new Person(4587,"Daniel","Haniev","HANIEV_@01gmail.com",34,String.valueOf("+99604411154"));
        Person person8= new Person(4524,"Pacha","Timaev","TIMAEV@01gmail.com",43,String.valueOf("+99604411154"));
        Person person9= new Person(9078,"Lida","Luchkova","LUSHKOVA@01gmail.com",49,String.valueOf("+99604411154"));
        Person person10= new Person(8765,"Aium","Usova","USOVA@01gmail.com",36,String.valueOf("+99604411154"));
        Person person11= new Person(6546,"Nurkyz","Jirnova","JIRNOVA_@01gmail.com",37,String.valueOf("+99604411154"));
        Person person12= new Person(1236,"Nelia","Urmatova","URMATOVA_@01gmail.com",54,String.valueOf("+99604411154"));
        Person person13= new Person(8713,"Dacha","Dimova","DIMOVA@01gmail.com",98,String.valueOf("+99604411154"));
        Person person14= new Person(9655,"Masha","Alegova","ALEGOVA_@01gmail.com",64,String.valueOf("+996 04411154"));
        Person person15= new Person(9876,"Nikita","Kuchkova","KUCHKOVA_@01gmail.com",45,String.valueOf("+996 04411154"));
        Person person16= new Person(1597,"Kanat","Darkevish","DARKEVISH_@01gmail.com",55,String.valueOf("+996 04411154"));
        Person person17= new Person(9087,"Jenich","Murkova","MUR_@01gmail.com",65,String.valueOf("+996 04411154"));
        Person person18= new Person(2176,"Jenuchbek","Asanov","ASANOV_@01gmail.com",34,String.valueOf("+996 04411154"));
        Person person19= new Person(4032,"Tumar","Osorov","OSOROV_@01gmail.com",23,String.valueOf("+996 04411154"));
        Person person20= new Person(4021,"Muras","Saev","SAEV@01gmail.com",75,String.valueOf("+996 04411154"));
        Person person21= new Person(9023,"Hannaa","Mike","MIKAEL_@01gmail.com",45,String.valueOf("+996 04411154"));
        Person person22= new Person(2309,"Lida","Leonidova","TYLEon@01gmail.com",38,String.valueOf("+996 04411154"));
        Person person23= new Person(9614,"Ania","Melova","MELOVA_@01gmail.com",34,String.valueOf("+99604411154"));
        Person person24= new Person(9021,"Nur","Nurova","NUROVA_@01gmail.com",20,String.valueOf("+99604411154"));
        Person person25= new Person(6412,"Karina","Kamelov","KAMELOV_@01gmail.com",25,String.valueOf("+99604411154"));
        Person person26= new Person(9034,"Suimuk","Alumbekov","ALUBEKOV@01gmail.com",45,String.valueOf("+99604411154"));
        Person person27= new Person(6742,"Aisal","Farhatov","FARHATOV_@01gmail.com",54,String.valueOf("+99604411154"));
        Person person28= new Person(9012,"Damir","Durov","DURK_@01gmail.com",57,String.valueOf("+99604411154"));
        Person person29= new Person(5429,"Temir","Janubekov","TEMIR_@01gmail.com",53,String.valueOf("+99604411154"));
        Person person30= new Person(1309,"Seka","Serov","SEROV_@01gmail.com",74,String.valueOf("+99604411154"));

        Person[] people = {person,person1,person2,person3,person4,person5};
        Person[] people1 ={ person6,person7,person8,person9,person10,person11};
        Person[] people2 ={ person12,person13,person14,person16,person15};
        Person[] people3 ={person17,person18,person19,person20,person21,person22,person23,person24,person25,person26,person27,person28,person29,person30};


        House house = new CrazyHouse (5476,"robmwh","Kirova 123",2016,75000, Arrays.toString(people));
        House house1 = new FashTeamHouse (9090,"robmwh ","Kirova 34",2018,88000,Arrays.toString(people1));
        House house2 = new StarHouse (1076,"robmwh","Aitmatov 156",2017,90100,Arrays.toString(people2));
        House house3 = new VipHouse (7564,"robmwh","Valenko 76",2020,100000,Arrays.toString(people3));
        System.out.println(house);

house.city();
house.electricity();


        System.out.println("Уйдо 6 киши жашайт");
        System.out.println("-----------------------------------------");
        System.out.println(house1);
        house1.city();
        house1.electricity();
        System.out.println("Уйдо 6 киши жашайт");
        System.out.println("---------------------------------------");
        System.out.println(house2);
        house2.city();
        house2.electricity();
        System.out.println("Уйдо 5 киши жашайт");
        System.out.println("--------------------------------------------");
        System.out.println(house3);
        house3.city();
        house3.electricity();
        System.out.println("Уйдо 14 киши жашайт");
        System.out.println("===========================================================");
        person.work();
        person.tameTable();
        }


    }
