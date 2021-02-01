package com.company;

import java.util.Random;

public class S21561 {

    public static void main(String[] args) {
        Container c1 = new Container(1,"piach");
        BasicContainer a =new BasicContainer(2,"piach");
        ColdContainer b =new ColdContainer(2,"mleko w kartonach",-14);
        LiquidContainer c =new LiquidContainer(2000,"paliwo",true);
        LooseContainer d =new LooseContainer(3500,"koparka", 12);
        WardrobeContainer e =new WardrobeContainer(4000,"ubrania", 1500);
        PlatformContainer f=new PlatformContainer(4000,"dziwg");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);

        Container[] fillContainers = new Container[15000];


        String[]  BasicContainerContent = new String[7];
        BasicContainerContent[0]="AGD";
        BasicContainerContent[1]="RTV";
        BasicContainerContent[2]="Czesci samochodowe";
        BasicContainerContent[3]="Akcesoria rolnicze";
        BasicContainerContent[4]="Artykuly spozywcze";
        BasicContainerContent[5]="Wsporniki meblowe";
        BasicContainerContent[6]="Przewody elektryczne";

        String []ColdContainer= new String [7];
        ColdContainer[0]="Mleko w kartonach";
        ColdContainer[1]="Mieso";
        ColdContainer[2]="Ryby";
        ColdContainer[3]="Lody";
        ColdContainer[4]="Owoce";
        ColdContainer[5]="Warzywa";
        ColdContainer[6]="Czekolada";

        String[]  LiquidContainer = new String[7];
        LiquidContainer[0]="Paliwo";
        LiquidContainer[1]="Mleko";
        LiquidContainer[2]="Amoniak";
        LiquidContainer[3]="Piwo";
        LiquidContainer[4]="Farba";
        LiquidContainer[5]="Sok pomarańczowy";
        LiquidContainer[6]="CocaCola";

        String[] LooseContainerContent = new String [7];
        LooseContainerContent[0]="Piach";
        LooseContainerContent[1]="Ziemia";
        LooseContainerContent[2]="Kwarc";
        LooseContainerContent[3]="Kamienie";
        LooseContainerContent[4]="Zwir";
        LooseContainerContent[5]="Wegiel";
        LooseContainerContent[6]="Otoczaki";

        String []WardrobeContainer = new String[7];
        WardrobeContainer[0]="Ubrania Sportowe";
        WardrobeContainer[1]="Ubrania Zimowe";
        WardrobeContainer[2]="Ubrania Formalne";
        WardrobeContainer[3]="Ubrania Letnie";
        WardrobeContainer[4]="Ubrania Jesienne";
        WardrobeContainer[5]="Ubrania Wiosenne";
        WardrobeContainer[6]="Ubrania Pracownicze";

        String []PlatformContainer = new String[7];
        PlatformContainer[0]="Samochod";
        PlatformContainer[1]="Wagon Pociagu";
        PlatformContainer[2]="Czesci do Czolgu";
        PlatformContainer[3]="Spychacz";
        PlatformContainer[4]="Materialy Budowlane";
        PlatformContainer[5]="Posag";
        PlatformContainer[6]="Lodz";

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


class LooseContainer extends Container{
    int density;        //gestosc
    public LooseContainer(int weight, String content,int density) {
        super(weight, content);
        this.density=density;
    }


    @Override
    public String toString() {
        return "OverWeightContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                ", density=" + density +
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


