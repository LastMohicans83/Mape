package mape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Osoba;

public class Mape {
public static void main(String[] args) {
   
    Osoba osoba = new Osoba();
        osoba.setIme("Nenad");
        osoba.setPrezime("Cvijanovic");
        osoba.setJMBG("123127341823");
        
    Osoba osoba2 = new Osoba("Pera", "Zdera", "12321321");
    
    List<Osoba> listaOsoba = new ArrayList<Osoba>();
        listaOsoba.add(osoba);
        listaOsoba.add(osoba2);

        //listaOsoba.get(0) uzima iz liste osoba vrednost sa pozicije 0
        //a get.ime uzima ime od osobe koja je sa pozicije 0
    System.out.println(listaOsoba.get(0).getIme());

    // inicijjalizacija mapa
    Map<String, String> mapaImena = new HashMap<String, String>(); 
        mapaImena.put("a1", "Nenad");
        mapaImena.put("s2", "Pera");
        mapaImena.put("m3", "Maja");
    
    System.out.println("Ime osobe je: " + mapaImena.get("m3"));    
        


    }

}
 