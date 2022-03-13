package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        Browser[] browsers = {new GoogleChrome(), new Firefox(), new Safari(), new IE()};

        for (Browser browser:browsers){
            browser.openBrowser();
            browser.loadPage("google.com");
            browser.testThePage();
            browser.closeBrowser();
            System.out.println("++++++++++++++++");
        }
    }
}
