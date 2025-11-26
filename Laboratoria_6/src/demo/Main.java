package demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hammer mlotek = new Hammer("Młotek",1998);
        Saw pila = new Saw("Piła do drewna", 2007);
        Screwdriver srubokret = new Screwdriver("Srubokret",2002);
        WorkTool lyzka = new WorkTool("Lyzka",1887) {
            @Override
            public void use() {
                System.out.println("Nalozono zuper na lyzke");
            }
        };
        ArrayList<WorkTool> narzedzia = new ArrayList<>();
        narzedzia.add(mlotek);
        narzedzia.add(pila);
        narzedzia.add(srubokret);
        narzedzia.add(lyzka);
        for(WorkTool workTool : narzedzia){
            workTool.use();
        }
    }
}
