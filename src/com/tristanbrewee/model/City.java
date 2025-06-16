package com.tristanbrewee.model;

public class City {

    private int id;
    private String name;
    private String countryId;
    private String district;
    private int population;

    public City() {
    }

    public City(int id, String name, String countryId, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.district = district;
        this.population = population;
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

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
