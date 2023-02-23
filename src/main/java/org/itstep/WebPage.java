package org.itstep;

public class WebPage {

    private String title;

    public WebPage(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "WebPage{" +
                "title='" + title + '\'' +
                '}';
    }
}
