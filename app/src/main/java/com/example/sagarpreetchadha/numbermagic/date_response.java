package com.example.sagarpreetchadha.numbermagic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sagarpreet chadha on 05-07-2016.
 */
public class date_response {
    @SerializedName("text")
    private String fact ;
    @SerializedName("year")
    private String  year ;
    @SerializedName("number")
    private String number ;
    @SerializedName("date")
    private String date ;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private boolean isfound ;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isfound() {
        return isfound;
    }

    public void setIsfound(boolean isfound) {
        this.isfound = isfound;
    }
}
