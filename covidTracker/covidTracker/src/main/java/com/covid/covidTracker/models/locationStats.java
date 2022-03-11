package com.covid.covidTracker.models;
public class locationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;
    public void setState(String state) {
        this.state = state;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public int getLatestTotalCases() {
        return latestTotalCases;
    }
    @Override
    public String toString() {
        return "locationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }
    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }
}
