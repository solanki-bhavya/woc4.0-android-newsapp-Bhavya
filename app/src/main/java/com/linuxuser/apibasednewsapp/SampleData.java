package com.linuxuser.apibasednewsapp;

public class SampleData {
    private String author,headline,content,publishedat;

    public SampleData(String author, String headline, String content, String publishedat) {
        this.author = author;
        this.headline = headline;
        this.content = content;
        this.publishedat = publishedat;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishedat() {
        return publishedat;
    }

    public void setPublishedat(String publishedat) {
        this.publishedat = publishedat;
    }
}
