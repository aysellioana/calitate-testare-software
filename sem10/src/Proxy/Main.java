package Proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet=new FilteredInternet();

        internet.connect("https://www.example.com");
        internet.connect("https://www.somesocialmedia.com");
    }
}