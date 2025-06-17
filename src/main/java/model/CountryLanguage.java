package model;

public class CountryLanguage {

    private String countryCode;
    private String language;
    private boolean boolOfficial;
    private double percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(double percentage, boolean boolOfficial, String language, String countryCode) {
        this.percentage = percentage;
        this.boolOfficial = boolOfficial;
        this.language = language;
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isBoolOfficial() {
        return boolOfficial;
    }

    public void setBoolOfficial(boolean boolOfficial) {
        this.boolOfficial = boolOfficial;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
