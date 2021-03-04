package com.yilouwangye.proxy;

public class ReallImage implements Image{
    private String fileName;
    public ReallImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("电脑扫描图像");
    }
    void loadFromDisk(String fileName){
        System.out.println("正在加载图像：" + fileName);
    }
}
