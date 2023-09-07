package org.example.pages;

import org.example.util.PropertiesLoader;

public class BasePage {
    public static final String BASE_URL = PropertiesLoader.loadProperty("url");
}
