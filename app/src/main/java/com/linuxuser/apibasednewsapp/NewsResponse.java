package com.linuxuser.apibasednewsapp;

import java.util.ArrayList;

public class NewsResponse  {
    private String status;
    private String NumberOfResults;
    private ArrayList<SampleData> articles;

    public NewsResponse(String status, String numberOfResults, ArrayList<SampleData> articles) {
        this.status = status;
        NumberOfResults = numberOfResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumberOfResults() {
        return NumberOfResults;
    }

    public void setNumberOfResults(String numberOfResults) {
        NumberOfResults = numberOfResults;
    }

    public ArrayList<SampleData> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<SampleData> articles) {
        this.articles = articles;
    }
}
