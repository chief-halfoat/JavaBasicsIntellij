package com.syntax.class25;
//Create a WebDriver Interface that will have the following unimplemented behaviour:
// openBrowser(), closeBrowser(), maximizeWindow(), findElement().
// Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
public class Task01 {
}

interface Webdriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements Webdriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}

class FirefoxDriver implements Webdriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
