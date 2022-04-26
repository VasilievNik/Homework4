package com.company;

public class Main {

    public static void main(String[] args) {
        //----------------------------------------
        int a = 10;
        while (a !=0){
            System.out.print(a + " ");
            a--;
        }
        System.out.println(" ");
        a++;
        while (a !=11){
            System.out.print(a + " ");
            a++;
        }
        System.out.println(" ");
        //-----------------------------------------
        int Friday = 2;
        for(int i = Friday; i<32; i++) {
            if ((i-Friday)%7 == 0){
                System.out.format("Сегодня пятница, %d-е число. Необходимо подготовить отчет!\n", i);
            }
        }
        //----------------------------------------
        for(int i = 1820; i<2100; i++) {
            if (i%79 == 0){
                System.out.println(i);
            }
        }
        //----------------------------------------
    }
}
