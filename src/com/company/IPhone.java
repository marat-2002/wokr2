package com.company;

public class IPhone extends Phone{
    private String model;
    private int warranty;

    public IPhone(int ram, int rom, String model, int warranty) {
        super(ram, rom);
        this.model = model;
        this.warranty = warranty;
    }

    @Override
    public void print() {
        System.out.println("Марка телефона: " + "Iphone" + "\nМодель : " + model + "\nГарантия : " + warranty);
return;
    }
}
