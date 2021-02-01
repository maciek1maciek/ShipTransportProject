package com.company;

import java.util.Random;

public class S21561 {

    public static void main(String[] args) {
        Container c1 = new Container(1,"piach");
        BasicContainer a =new BasicContainer(2,"piach");
        ColdContainer b =new ColdContainer(2,"mleko w kartonach",-14);
        LiquidContainer c =new LiquidContainer(2000,"paliwo",true);
        OverWeightContainer d =new OverWeightContainer(3500,"koparka", "zolta");
        WardrobeContainer e =new WardrobeContainer(4000,"ubrania", 1500);
        PlatformContainer f=new PlatformContainer(4000,"dziwg");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);

        Container[] fillContainers = new Container[15000];


        String[]  BasicContainerContent = new String[5];
        BasicContainerContent[0]="AGD";
        BasicContainerContent[1]="RTV";
        BasicContainerContent[2]="Czesci samochodowe";
        BasicContainerContent[3]="Akcesoria rolnicze";
        BasicContainerContent[4]="Artykuly spozywcze";

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


class OverWeightContainer extends Container{
    String flag;        //flaga kontenera
    public OverWeightContainer(int weight, String content,String flag) {
        super(weight, content);
        this.flag=flag;
        System.out.println(flag);
    }


    @Override
    public String toString() {
        return "OverWeightContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                ", flag=" + flag +
                '}';
    }
}

class WardrobeContainer extends Container{
    int hangers;        //ilosc wieszakow
    public WardrobeContainer(int weight, String content,int hangers) {
        super(weight, content);
        this.hangers=hangers;
    }

    @Override
    public String toString() {
        return "WardrobeContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                ", hangers=" + hangers +
                '}';
    }
}

class PlatformContainer extends Container{
    public PlatformContainer(int weight, String content) {
        super(weight, content);
    }

    @Override
    public String toString() {
        return "PlatformContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}


