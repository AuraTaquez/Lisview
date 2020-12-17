package com.example.listviewwithapirestdata.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Countri {
     private String Country;
     private String CountryCode;
    private String Slug;
    private int NewConfirmed;
    private int TotalConfirmed;
    private int NewDeaths;
    private int TotalDeaths;
    private int NewRecovered;
    private int TotalRecovered;
    private String Date;

    public Object getPremium() {
        return Premium;
    }

    public void setPremium(Object premium) {
        Premium = premium;
    }

    Object Premium;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public int getNewConfirmed() {
        return NewConfirmed;
    }

    public void setNewConfirmed(int newConfirmed) {
        NewConfirmed = newConfirmed;
    }

    public int getTotalConfirmed() {
        return TotalConfirmed;
    }

    public void setTotalConfirmed(int totalConfirmed) {
        TotalConfirmed = totalConfirmed;
    }

    public int getNewDeaths() {
        return NewDeaths;
    }

    public void setNewDeaths(int newDeaths) {
        NewDeaths = newDeaths;
    }

    public int getTotalDeaths() {
        return TotalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        TotalDeaths = totalDeaths;
    }

    public int getNewRecovered() {
        return NewRecovered;
    }

    public void setNewRecovered(int newRecovered) {
        NewRecovered = newRecovered;
    }

    public int getTotalRecovered() {
        return TotalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        TotalRecovered = totalRecovered;
    }

    public String getDate() {
        return Date;
    }
    public Countri(JSONObject a) throws JSONException {

        Country =  a.getString("Country").toString();
        CountryCode =  a.getString("CountryCode").toString() ;
        Date = a.getString("Date");
        Slug = a.getString("Slug");
          }
    public void setDate(String date) {
        Date = date;
    }
    public static ArrayList<Countri> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Countri> Countries = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            Countries.add(new Countri(datos.getJSONObject(i)));
        }
        return Countries;
    }

}
