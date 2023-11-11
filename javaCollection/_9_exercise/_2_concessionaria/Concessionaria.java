package _1_javaExerciseForGithub.tutorExe._2_concessionaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concessionaria {

    private String nome;
    private String indirizzo;
    private List<Car> autoInVendita = new ArrayList<>();

    public Concessionaria(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public Concessionaria(List<Car> autoInVendita) {
        this.autoInVendita = new ArrayList<>(autoInVendita);
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public List<Car> getAutoInVendita() {
        return autoInVendita;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
// conteggio di item all'interno di una mappa
    public Map<String, Integer> countMarcaCar() {
        Map<String, Integer> newMap = new HashMap<>();
        int countCar = 0;
        for (Car c : autoInVendita) {
          if(newMap.containsKey(c.getMarchio())){
              int newValue = newMap.get(c.getMarchio()) + 1 ;
              newMap.put(c.getMarchio(), newValue);
          }else {
              newMap.put(c.getMarchio(), 1);
          }
        }
        return newMap;
    }

    public Car searchCar(String c) {
        for (Car newCar : autoInVendita) {
            if (c.strip().toLowerCase().equals(newCar.getMarchio())) {
                System.out.println(newCar.getModello());
            }
        }
        return null;
    }

    public void addCar(Car c) {
        autoInVendita.add(c); // permette di aggiungere auto alla concessionaria
    }

    public double getPrezzoMedio() {
        int sum = 0;
        for (Car c : autoInVendita) {
            sum += c.getPrezzo();
        }
        return sum / autoInVendita.size();
    }
}
