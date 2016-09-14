package com.foldik.learn.objects;

public class Country {

    private String name;
    private double gdp;
    private double population;
    private double area;
    private String currency;

    public Country(String name, double gdp, double population, double area, String currency) {
        this.name = name;
        this.gdp = gdp;
        this.population = population;
        this.area = area;
        this.currency = currency;
    }

    public String getName(){ return  name; }
    public double getGdp() {
        return gdp;
    }
    public double getPopulation() {
        return population;
    }
    public double getArea() {
        return area;
    }
    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "CountriesApp{" +
                "name='" + name + '\'' +
                "gdp='" + gdp + '\'' +
                ", population=" + population + '\'' +
                ", area='" + area + '\'' +
                ", currency=" + currency +
                '}';
    }


}