package com.ejerciciopoke.pokiapi.repository;

import com.ejerciciopoke.pokiapi.dto.PokemonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeApi" , url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {

    @GetMapping("/pokemon/{id}")
    PokemonDto getPokemon(@PathVariable("id") int id);
}
