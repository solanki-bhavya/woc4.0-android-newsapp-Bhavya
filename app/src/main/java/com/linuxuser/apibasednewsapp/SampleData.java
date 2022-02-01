package com.linuxuser.apibasednewsapp;

public class SampleData {
    private String author,headline,content,publishedAt="",url,urlToImage;

    public SampleData(String author, String headline, String content, String publishedat, String url, String urlOfImage) {
        this.author = author;
        this.headline = headline;
        this.content = content;
        this.publishedAt = publishedat;
        this.url = url;
        this.urlToImage = urlOfImage;
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
        return publishedAt;
    }

    public void setPublishedat(String publishedat) {
        this.publishedAt = publishedat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlOfImage() {
        return urlToImage;
    }

    public void setUrlOfImage(String urlOfImage) {
        this.urlToImage = urlOfImage;
    }
}
