package com.sorteiominecraft.Sorteiominecraft.controller;

import com.sorteiominecraft.Sorteiominecraft.dto.PlayerDto;
import com.sorteiominecraft.Sorteiominecraft.Sorteio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/")
public class SorteioController {

    @GetMapping("/sorteio")
    public ResponseEntity<Map<String , PlayerDto>> getSorteio(){
        Sorteio sorteio = new Sorteio();

        return new ResponseEntity<>(sorteio.soteia() , HttpStatus.OK);
    }

    @GetMapping("/origens")
    public ResponseEntity<Map<String, ArrayList<String>>> getOrigens(){
        Sorteio sorteio = new Sorteio();

        return new ResponseEntity<>(sorteio.getOrigens() , HttpStatus.OK);
    }

    @GetMapping("/classes")
    public ResponseEntity<Map<String, ArrayList<String>>> getClasses(){
        Sorteio sorteio = new Sorteio();

        return new ResponseEntity<>(sorteio.getClasses() , HttpStatus.OK);
    }

}
