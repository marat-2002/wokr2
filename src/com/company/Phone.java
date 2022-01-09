package com.company;

public abstract class Phone implements Printable {
    private int ram;
    private int rom;

    public Phone(int ram, int rom) {
        this.ram = ram;
        this.rom = rom;
    }
}

