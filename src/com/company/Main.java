package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        createNewObject(1);//type number from 1 to 3
        createNewObject(2);//type number from 1 to 3
        createNewObject(3);//type number from 1 to 3
        createNewObject(4);//type number from 1 to 3

    }
    public static Object createNewObject(int Phone ){
        Random random = new Random();
        int b = random.nextInt(30);
        int c = random.nextInt(30);
        switch (Phone){
            case 1:
                Samsung samsung = new Samsung(c, b, 128, "S22 Ultra");
                samsung.print();
                break;
            case 2:
                IPhone iPhone = new IPhone(c, b, "Айфон 11 ProMax", 5);
                iPhone.print();
                break;
            case 3:
                Huawei huawei = new Huawei(b, c, 4500, "4G");
                huawei.print();
                break;
            default:
                System.out.println("TYPE NUMBER FROM 1 TO 3!!!");
        }
        return null;
    }
}
