package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
    public double TotalDistance(double heigh, double length, double towerheigh)
    {
        return ((towerheigh / heigh) *(length + heigh ));
    }
}
