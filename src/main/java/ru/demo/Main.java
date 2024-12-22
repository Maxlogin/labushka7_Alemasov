package ru.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String link = "https://media.2x2tv.ru/jojo-fenomen/";
        try{
            Document doc = Jsoup.connect(link).get();
            Elements les = doc.select("div");
            //System.out.println(les);
            for(Element element: les)
                System.out.println(element.text());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}