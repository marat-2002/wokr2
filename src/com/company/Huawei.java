package com.company;

public class Huawei extends Phone{
    private int batteryCapacity;
    private String network;

    public Huawei(int ram, int rom, int batteryCapacity, String network) {
        super(ram, rom);
        this.batteryCapacity = batteryCapacity;
        this.network = network;
    }

    @Override
    public void print() {
        System.out.println("Марка телефона: " + "Huawei" + "\nМощность батареи : " + batteryCapacity + "\nСеть : " + network);
return;
    }
}
