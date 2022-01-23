package com.softserveinc.task02;

public class City {
  private String name;
  private String region;
  private String country;
  private int inhabitants;

  public City() {
  }
  public City(String name, String region, String country, int inhabitants) {
      this.name = name;
      this.region = region;
      this.country = country;
      this.inhabitants = inhabitants;
  }
    public void setName (String name) {
      this.name = name;
  }
    public String getName() {
        return name;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion () {
      return region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", inhabitants=" + inhabitants +
                '}';
    }
}
