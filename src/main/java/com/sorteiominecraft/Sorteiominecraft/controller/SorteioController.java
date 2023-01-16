package com.sorteiominecraft.Sorteiominecraft.controller;

import com.sorteiominecraft.Sorteiominecraft.Player;
import com.sorteiominecraft.Sorteiominecraft.Sorteio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sorteio")
public class SorteioController {

    @GetMapping
    public ResponseEntity<Map<String , Player>> getSorteio(){
        Sorteio sorteio = new Sorteio();

        return new ResponseEntity<>(sorteio.soteia() , HttpStatus.OK);
    }

}
