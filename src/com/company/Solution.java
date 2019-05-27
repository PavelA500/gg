package com.company;

/*
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        double t= Double.parseDouble(bufferedReader.readLine());

        //тут проверка двузначно ли само число
        //не дописал. думал простой раздвоеный иф бахнуть

        //тут проверка для однозначных
        if ((t>=0 && t<3) || (t>=5 && t<8)){
            System.out.print("зеленый");
        }
        else if ((t>=3 && t<4) || (t>=8 && t<9)){
            System.out.print("желтый");
        }
        else if ((t>=4 && t<5 ) || (t>=9 && t<10)){
            System.out.print("красный");
        }

        //тут проверка для двузначных
        if ((t%10>=0 && t%10<3) || (t%10>=5 && t%10<8)){
            System.out.print("зеленый");
        }
        else if ((t%10>=3 && t%10<4) || (t%10>=8 && t%10<9)){
            System.out.print("желтый");
        }
        else if ((t%10>=4 && t%10<5) || (t%10>=9 && t%10<10)){
            System.out.print("красный");
        }
    }
}
