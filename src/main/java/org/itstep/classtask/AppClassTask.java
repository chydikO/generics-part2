package org.itstep.classtask;

import org.itstep.WebPage;

public class AppClassTask {
    public static void main(String[] args) {
        MyStack<WebPage> browserHistory = new MyStack<>();

        browserHistory.push(new WebPage("https://google.com"));
        browserHistory.push(new WebPage("https://itstep.dp.ua"));
        browserHistory.push(new WebPage("https://chat.openia.com"));

        System.out.println(browserHistory.size()); // 3
        System.out.println(browserHistory.pop()); // https://chat.openia.com
        System.out.println(browserHistory.pop()); // https://itstep.dp.ua
        System.out.println(browserHistory.pop()); // https://google.com
        System.out.println(browserHistory.isEmpty()); // true
    }
}
