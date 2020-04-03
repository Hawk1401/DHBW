package de.dhbwka.java.exercise.classes.periodic;

import java.util.ArrayList;
import java.util.List;


public class  PeriodicTable {
    public static void main(String[]args){
        PeriodicTable table  = new PeriodicTable();
        table.addElement(new Element("H", "WasserStoff", 1, 3, 'K', true));
        table.addElement(new Element("He", "Helium", 2, 3, 'K', true));
        table.addElement(new Metal("Na", "Natrium", 11, 1, 'M', true, false , 2.1E7));
        table.addElement(new Metal("Fe", "Eisen", 26, 1, 'N', false, false , 1.002E7));
        table.addElement(new Metal("Ge", "Germanium", 32, 1, 'N', false, true , 1.45));
        table.addElement(new Element("Br", "Brom", 35, 2, 'N', true));
        table.addElement(new Metal("Te", "Tellur", 52, 1, 'O', true, true , 0.005));
        table.addElement(new Metal("Au", "Gold", 79, 1, 'P', false, false , 4.4E7));

        Element[] metals = table.getMetals();
        for (int i = 0; i < metals.length; i++) {
            System.out.println(metals[i].toString());
        }

        System.out.println(table.getElement(79).toString());
    }



    private Element[] Table = new Element[118];
    private int count = 0;

    public void addElement(Element e) {
        Table[count] = e;
        count++;
    }


    public boolean hasElement(int o) {
        for (Element element :
                Table) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Element getElement(int o){
        for (Element element :
                Table) {
            if (element.equals(o)) {
                return element;
            }
        }
        return null;
    }

    public Element[] getMetals(){
        List<Element> Metals = new ArrayList<Element>();
        for (Element element :
                Table) {
            if (element instanceof Metal) {
                Metals.add(element);
            }
        }
        Element[] outPut = new Element[Metals.size()];
        for (int i = 0; i < outPut.length; i++) {
            outPut[i] = Metals.get(i);
        }
        return outPut;
    }
}
