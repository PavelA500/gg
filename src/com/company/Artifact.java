package com.company;


public class Artifact {
    int nomer;
    String cult;
    int vek;
    static int coutn1=0;
    static int coutn2=0;
    static int coutn3=0;

    public Artifact (int nomer) {
        this.nomer=nomer;
        coutn1++;
    }
    public Artifact (int nomer,String cult) {
        this.nomer=nomer;
        this.cult=cult;
        coutn2++;
    }
    public Artifact (int nomer,String cult,int vek) {
        this.nomer=nomer;
        this.cult=cult;
        this.vek=vek;
        coutn3++;
    }

    public static void main(String[] args) {
        Artifact pupa = new Artifact(1);
        Artifact lupa = new Artifact(2);
        Artifact zalupa = new Artifact(3,"aztek",15);
        System.out.println(coutn1+" "+coutn2+" "+coutn3);
    }
}