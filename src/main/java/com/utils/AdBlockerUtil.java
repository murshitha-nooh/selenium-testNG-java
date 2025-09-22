package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AdBlockerUtil {

    public static void blockAds(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Override ad-loading globals (GPT, AdSense, etc.)
        js.executeScript("window.googletag = { cmd: [] };");
        js.executeScript("window.adsbygoogle = [];");

        // Remove common ad containers and iframes
        js.executeScript(
            "document.querySelectorAll('[id*=\"ad\"], [class*=\"ad\"], " +
            "iframe[src*=\"ads\"], iframe[src*=\"doubleclick\"], " +
            "iframe[src*=\"googlesyndication\"], [class*=\"banner\"], [class*=\"popup\"], [class*=\"overlay\"]')" +
            ".forEach(el => el.remove());"
        );
    }
}
