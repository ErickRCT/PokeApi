package com.ejerciciopoke.pokiapi.controller;

import com.ejerciciopoke.pokiapi.dto.PokemonDto;
import com.ejerciciopoke.pokiapi.repository.PokeApiClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
@AllArgsConstructor
public class PokemonController {

    private PokeApiClient pokeApiClient;

    @GetMapping("/{id}")
    public PokemonDto obtenerPokemon(@PathVariable("id") int id) {
        return pokeApiClient.getPokemon(id);
    }
}

