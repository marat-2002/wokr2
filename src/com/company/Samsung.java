package com.company;

public class Samsung extends Phone {
    private int memory;
    private String design;

    public Samsung(int ram, int rom, int memory, String design) {
        super(ram, rom);
        this.memory = memory;
        this.design = design;
    }

    @Override
    public void print() {
        System.out.println("Марка телефона: " + "Samsung" + "\nПамять : " + memory + "\nДизайн: " + design);

    }
}
