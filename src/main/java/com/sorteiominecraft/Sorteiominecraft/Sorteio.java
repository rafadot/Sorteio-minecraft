package com.sorteiominecraft.Sorteiominecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Sorteio {
    private final ArrayList<String> players = new ArrayList<>();
    private final ArrayList<String> classes = new ArrayList<>();
    private final ArrayList<String> origens = new ArrayList<>();

    public Sorteio() {
        this.players.add("Adauto");
        this.players.add("Alves");
        this.players.add("Dot");
        this.players.add("Tobias");

        this.classes.add("Tolo");
        this.classes.add("Fazendeiro");
        this.classes.add("Rancheiro");
        this.classes.add("Minerador");
        this.classes.add("Lenhador");
        this.classes.add("Cozinheiro");
        this.classes.add("Ferreiro");
        this.classes.add("Clérigo");
        this.classes.add("Mercante");
        this.classes.add("Explorador");
        this.classes.add("Guerreiro");
        this.classes.add("Arqueiro");
        this.classes.add("Gatuno");
        this.classes.add("Mestre das Feras");

        this.origens.add("Humano");
        this.origens.add("Aviário");
        this.origens.add("Aracnídio");
        this.origens.add("Elitriano");
        this.origens.add("Shulk");
        this.origens.add("Felino");
        this.origens.add("Enderiano");
        this.origens.add("Oceânico");
        this.origens.add("Incandescente");
        this.origens.add("Vulto");
    }

    public Map<String , Player> soteia(){
        Random random = new Random();

        ArrayList<String> origens1 = origens;
        ArrayList<String> classes1 = classes;

        Map<String, Player> response = new HashMap<>();

        for (String player : players) {
            Player p = new Player();

            String origem = origens1.get(random.nextInt(origens1.size()));;
            origens.remove(origem);
            String classe = classes1.get(random.nextInt(classes1.size()));;
            classes1.remove(classe);

            p.setOrigem(origem);
            p.setClasse(classe);

            response.put(player, p);

            System.out.println(player + " // " + origem + " -- " + classe);
        }

        return response;
    }
}
