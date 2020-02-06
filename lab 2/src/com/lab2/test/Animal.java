package com.lab2.test;

import java.sql.SQLOutput;

public class Animal {

   private String name;
   private String breed;
   private int age;
    private String DomesticAnimal;
    private String color;

    public Animal(String name,String breed,int age,String color,String DomesticAnimal)
    {
        this.age=age;
        this.breed=breed;
        this.name=name;
        this.color=color;
        this.DomesticAnimal=DomesticAnimal;
    }
    public Animal(String Horse_name)
    {
        this.name=Horse_name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getDomesticAnimal() {
        return DomesticAnimal;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomesticAnimal(String domesticAnimal) {
        DomesticAnimal = domesticAnimal;
    }
    public String toString()
    {
        return "Animal Name: "+ getName()+"\nBreed: "+getBreed()+"\nColor: "+getColor()+"\nAge: "+getAge()+"\nDomestic?: "+getDomesticAnimal();
    }

    public void SetName(String name)
    {

    }
    public void MakeNoise(){
        if(breed == "Duck")
        {
            System.out.println("QUAAACCK");
        }
        if(breed == "Cat")
        {
            System.out.println("Meooooooowww");
        }
        if(breed == "Dog")
        {
            System.out.println("Woof");
        }
        if(breed == "Platypus")
        {
            System.out.println("Grrrrr");
        }
    }
    public void MakeNoise(boolean old)
    {

    }

}
