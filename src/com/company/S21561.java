package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
        int range = (con.length-1- 0) + 1;
        return con[(int)(Math.random() * range) + 0];
    }

    static Container RandomContainer(Container a,Container b,Container c,Container d,Container e,Container f){          //losuje losowy obiekt zeby tablica nie byla po kolei wypelniona
        Container[] tab = new Container[6];
        tab[0]=a;
        tab[1]=b;
        tab[2]=c;
        tab[3]=d;
        tab[4]=e;
        tab[5]=f;
        int range = (tab.length-1- 0) + 1;
        return tab[(int)(Math.random() * range) + 0];
    }

    static int id=0;
    static int id2=0;
    public static void main(String[] args) {

        Container[] fillContainers = new Container[15000];  //tablica wypelniona lsoowaymi kontenerami z losowymi wartosciami

        String[]  BasicContainerContent = new String[7];
        BasicContainerContent[0]="AGD";
        BasicContainerContent[1]="RTV";
        BasicContainerContent[2]="Czesci samochodowe";
        BasicContainerContent[3]="Akcesoria rolnicze";
        BasicContainerContent[4]="Artykuly spozywcze";
        BasicContainerContent[5]="Wsporniki meblowe";
        BasicContainerContent[6]="Przewody elektryczne";

        String []ColdContainerContent= new String [7];
        ColdContainerContent[0]="Mleko w kartonach";
        ColdContainerContent[1]="Mieso";
        ColdContainerContent[2]="Ryby";
        ColdContainerContent[3]="Lody";
        ColdContainerContent[4]="Owoce";
        ColdContainerContent[5]="Warzywa";
        ColdContainerContent[6]="Czekolada";

        String[]  LiquidContainerContent = new String[7];
        LiquidContainerContent[0]="Paliwo";
        LiquidContainerContent[1]="Mleko";
        LiquidContainerContent[2]="Amoniak";
        LiquidContainerContent[3]="Piwo";
        LiquidContainerContent[4]="Farba";
        LiquidContainerContent[5]="Sok pomarańczowy";
        LiquidContainerContent[6]="CocaCola";

        String[] LooseContainerContent = new String [7];
        LooseContainerContent[0]="Piach";
        LooseContainerContent[1]="Ziemia";
        LooseContainerContent[2]="Kwarc";
        LooseContainerContent[3]="Kamienie";
        LooseContainerContent[4]="Zwir";
        LooseContainerContent[5]="Wegiel";
        LooseContainerContent[6]="Otoczaki";

        String []WardrobeContainerContent = new String[7];
        WardrobeContainerContent[0]="Ubrania Sportowe";
        WardrobeContainerContent[1]="Ubrania Zimowe";
        WardrobeContainerContent[2]="Ubrania Formalne";
        WardrobeContainerContent[3]="Ubrania Letnie";
        WardrobeContainerContent[4]="Ubrania Jesienne";
        WardrobeContainerContent[5]="Ubrania Wiosenne";
        WardrobeContainerContent[6]="Ubrania Pracownicze";

        String []PlatformContainerContent = new String[7];
        PlatformContainerContent[0]="Samochod";
        PlatformContainerContent[1]="Wagon Pociagu";
        PlatformContainerContent[2]="Czesci do Czolgu";
        PlatformContainerContent[3]="Spychacz";
        PlatformContainerContent[4]="Materialy Budowlane";
        PlatformContainerContent[5]="Posag";
        PlatformContainerContent[6]="Lodz";



        for(int i=0;i<fillContainers.length;i++){       //wypelnienie  losowymi kontenerami z losowymi wartosciami tablciy
            fillContainers[i]=RandomContainer(
                    new BasicContainer(RandomWeight(),RandomContent(BasicContainerContent)),
                    new ColdContainer(RandomWeight(),RandomContent(ColdContainerContent),Randomtemp()),
                    new LiquidContainer(RandomWeight(),RandomContent(LiquidContainerContent),RandomDensity()),
                    new LooseContainer(RandomWeight(),RandomContent(LooseContainerContent),RandomDensity()),
                    new WardrobeContainer(RandomWeight(),RandomContent(WardrobeContainerContent),RandomHangers()),
                    new PlatformContainer(RandomWeight(),RandomContent(PlatformContainerContent)));
        }


        try {
            PrintWriter out = new PrintWriter("ListaKontenerow.txt");
            for(Container c:fillContainers)
                out.println(c+"\n");
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Blad w tworzeniu pliku!");
        }

        for(int i=0;i<fillContainers.length-1;i++){     //sortowanie babelkowe sortowanie od najwiekszej wagi do najmniejszej
            for(int j=0;j<fillContainers.length-1;j++){
                if(fillContainers[j].weight<fillContainers[j+1].weight){
                    Container temp =fillContainers[j];
                    fillContainers[j]=fillContainers[j+1];
                    fillContainers[j+1]=temp;
                }
            }
        }

        Container[][][] Ship = new Container[5][5][600];        //wypelnianie kontenerowca
        for(int h=0;h<Ship.length;h++){                 //petla do zmiany wysokosci czyli pietra
            for(int g=0;g<Ship[h].length;g++){                 //petla do zmiany rzedu
                for(int i=0;i<Ship[h][g].length;i++){       //petla do zmiany pozycji w rzedzie
                    id++;
                    Ship[h][g][i]=fillContainers[id-1];     //id-1 bo talbica jest do 15000 a zaczyna od 0 wiec musi byc 14999
                }
            }
        }
        FileWriter plik=null;
        for(int h=0;h<Ship.length;h++){                 //petla do zmiany wysokosci czyli pietra
            for(int g=0;g<Ship[h].length;g++){                 //petla do zmiany rzedu
                for(int i=0;i<Ship[h][g].length;i++){       //petla do zmiany pozycji w rzedzie
                    id2++;
                    try {
                        plik = new FileWriter("Manifest.txt",true); //append true bo dodaje na koniec jak false to na poczatek
                        plik.write("numer kontenera:\t"+id2+",\t"+"pozycja:\t"+"pietro:\t"+(h+1)+"\trzad:\t"+(g+1)+"\tmiejsce:\t"+(i+1)+"\t"+Ship[h][g][i]+"\n");
                        plik.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }





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
                ", density=" + density +
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
        return "LooseContainer{" +
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


