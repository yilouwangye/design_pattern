package com.yilouwangye.proxy;

public class ProxyImage implements Image{
    private ReallImage reallImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        reallImage = new ReallImage(fileName);
        reallImage.display();
    }

    public static void main(String[] args) {
        Image image = new ProxyImage("ting_01.jpg");
        image.display();
    }
}
