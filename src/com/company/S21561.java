package com.company;

import java.util.Base64;
import java.util.Random;

public class S21561 {

    static int RandomWeight(){
        int range = (28000- 10000) + 1;
        return (int)(Math.random() * range) + 10000;
    }
    static int Randomtemp(){
        int range = (7- 3) + 1;
        return (int)(Math.random() * range) + 3;
    }
    static int RandomDensity(){
        int range = (990- 400) + 1;
        return (int)(Math.random() * range) + 400;
    }
    static int RandomHangers(){
        int range = (1800- 1000) + 1;
        return (int)(Math.random() * range) + 1000;
    }
    static String RandomContent(String []con){
        int range = (con.length- 0) + 1;
        return con[(int)(Math.random() * range) + 0];
    }

    static Container RandomContainer(Container a){          //losuje losowy obiekt zeby tablica nie byla po kolei wypelniona
        Container[] tab = new Container[6];
        tab[0]=a;
        //tab[1]=b;
       // tab[2]=c;
       // tab[3]=d;
        //tab[4]=e;
       // tab[5]=f;
       // int range = (5- 0) + 1;
        //return tab[(int)(Math.random() * range) + 0];
        return tab[0];
    }

    public static void main(String[] args) {
        Container c1 = new Container(1,"piach");
        BasicContainer a =new BasicContainer(2,"piach");
        ColdContainer b =new ColdContainer(2,"mleko w kartonach",-14);
        LiquidContainer c =new LiquidContainer(2000,"paliwo",12);
        LooseContainer d =new LooseContainer(3500,"koparka", 12);
        WardrobeContainer e =new WardrobeContainer(4000,"ubrania", 1500);
        PlatformContainer f=new PlatformContainer(4000,"dziwg");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);

        Container[] fillContainers = new Container[15000];


    /*
        for(int i=0;i<fillContainers.length;i++){
            fillContainers[i]=
        }
       */
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


        System.out.println(RandomContainer(new BasicContainer(RandomWeight(),RandomContent(BasicContainerContent))));

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
    int density;
    public LiquidContainer(int weight, String content,int density) {
        super(weight, content);
        this.density=density;
    }

    @Override
    public String toString() {
        return "LiquidContainer{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                ", flammable=" + density +
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


