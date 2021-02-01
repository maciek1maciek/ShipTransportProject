package com.company;

public class S21561 {

    public static void main(String[] args) {
        Container c1 = new Container(1,"piach");
        BasicContainer a =new BasicContainer(2,"piach");
        ColdContainer b =new ColdContainer(2,"mleko",-14);
        LiquidContainer c =new LiquidContainer(2000,"petrol",true);
        System.out.println(a+"\n"+b+"\n"+c);

    }


}
class Container{
    int weight;
    String content;

    public Container(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Container{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}

class BasicContainer extends Container{

    public BasicContainer(int weight, String content) {
        super(weight, content);
    }

    @Override
    public String toString() {
        return "BasicContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}

class ColdContainer extends Container{
    int temp;
    public ColdContainer(int weight, String content,int temp) {
        super(weight, content);
        this.temp=temp;
    }

    @Override
    public String toString() {
        return "ColdContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                ", temperature= " + temp +
                '}';
    }
}

class LiquidContainer extends Container{
    boolean flammable;
    public LiquidContainer(int weight, String content,boolean flammable) {
        super(weight, content);
        this.flammable=flammable;
    }

    @Override
    public String toString() {
        return "LiquidContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                ", flammable=" + flammable +
                '}';
    }
}

//kontener cysterna,ponadgabarytowy,kontener szafa do odziezy na wiszaco
