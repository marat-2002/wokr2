package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Printable[] printables = {createNewObject(0), createNewObject(1), createNewObject(2)};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
            
        }
    }
    public static Printable createNewObject(int Phone ) {
        Random random = new Random();
        int b = random.nextInt(30);
        int c = random.nextInt(30);
        switch (Phone) {
            case 0:
                Samsung samsung = new Samsung(c, b, 128, "S22 Ultra");
                return samsung;
            case 1:
                IPhone iPhone = new IPhone(c, b, "Айфон 11 ProMax", 5);
               return iPhone;
            case 2:
                Huawei huawei = new Huawei(b, c, 4500, "4G и 5G");
                return huawei;
            default:
                System.out.println("1 TO 3");
        }
        return null;
    }
}
