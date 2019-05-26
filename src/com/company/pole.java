package com.company;

public class pole {

        String name;
        short age;
        int height;

        public pole(String name,short age,int height){
            this.name=name;
            this.age=age;
            this.height=height;
        }

        public static void main(String[] args) {
            pole vasia= new pole("vasia",(short)15,195);
            pole lesha= new pole("lesha",(short)29,125);
            pole masha= new pole("masha",(short)44,190);
            pole sasha= new pole("sasha",(short)10,365);
            System.out.println("Имя: " + vasia.name + ", Возраст: " + vasia.age + ", Рост: "+ vasia.height);
            System.out.println("Имя: " + lesha.name + ", Возраст: " + lesha.age + ", Рост: "+ lesha.height);
            System.out.println("Имя: " + masha.name + ", Возраст: " + masha.age + ", Рост: "+ masha.height);
            System.out.println("Имя: " + sasha.name + ", Возраст: " + sasha.age + ", Рост: "+ sasha.height);
        }
    }
