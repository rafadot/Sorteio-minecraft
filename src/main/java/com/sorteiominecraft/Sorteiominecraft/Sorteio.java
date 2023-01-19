package com.sorteiominecraft.Sorteiominecraft;

import com.sorteiominecraft.Sorteiominecraft.dto.PlayerDto;

import java.util.*;

public class Sorteio {
    private final ArrayList<String> players = new ArrayList<>();
    private final ArrayList<String> classes = new ArrayList<>();
    private final ArrayList<String> origens = new ArrayList<>();

    public Sorteio() {
        this.players.add("Adauto");
        this.players.add("Alves");
        this.players.add("Dot");
        this.players.add("Tobias");

        //Classes
        this.classes.add("Fazendeiro");
        this.classes.add("Rancheiro");
        this.classes.add("Minerador");
        this.classes.add("Cozinheiro");
        this.classes.add("Ferreiro");
        this.classes.add("Clérigo");
        this.classes.add("Mercante");
        this.classes.add("Explorador");
        this.classes.add("Guerreiro");
        this.classes.add("Mestre das Feras");

        //Origens
        this.origens.add("Aviário");
        this.origens.add("Aracnídio");
        this.origens.add("Elitriano");
        this.origens.add("Shulk");
        this.origens.add("Enderiano");
        this.origens.add("Oceânico");
        this.origens.add("Vulto");
        this.origens.add("Goblin");
        this.origens.add("Elf");
        this.origens.add("Knight");
        this.origens.add("Daemon");
        this.origens.add("Fae");
        this.origens.add("Siren");
        this.origens.add("Yeti");
        this.origens.add("Werewolf");
        this.origens.add("Plague Victim");
        this.origens.add("Paladin");
        this.origens.add("Slime");
        this.origens.add("Ogre");
        this.origens.add("Troll");
        this.origens.add("Dwarf");
        this.origens.add("Gorgon");
        this.origens.add("Moth");
        this.origens.add("Minotaur");
        this.origens.add("Deer");
        this.origens.add("Demon");
        this.origens.add("Wood Elf");
        this.origens.add("Piglin Brute");
    }

    public Map<String , PlayerDto> soteia(){
        Random random = new Random();

        ArrayList<String> origens1 = origens;
        ArrayList<String> classes1 = classes;

        Map<String, PlayerDto> response = new LinkedHashMap<>();

        for (String player : players) {
            PlayerDto p = new PlayerDto();

            String origem = origens1.get(random.nextInt(origens1.size()));;
            origens.remove(origem);
            String classe = classes1.get(random.nextInt(classes1.size()));;
            classes1.remove(classe);

            p.setOrigem(origem);
            p.setClasse(classe);

            response.put(player, p);
        }

        return response;
    }

    public Map<String, ArrayList<String>> getPlayers() {
        Map<String, ArrayList<String>> response = new LinkedHashMap<>();
        response.put("Players" , this.players);
        return response;
    }

    public Map<String, ArrayList<String>> getClasses() {
        Map<String, ArrayList<String>> response = new LinkedHashMap<>();
        response.put("Classes" , this.classes);
        return response;
    }

    public Map<String, ArrayList<String>> getOrigens() {
        Map<String, ArrayList<String>> response = new LinkedHashMap<>();
        response.put("Origens" , this.origens);
        return response;
    }
}
