package me.sairu.sdw.application;

import me.sairu.sdw.domain.model.Champion;
import me.sairu.sdw.domain.ports.ChampionsRepository;

import java.util.List;


public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champion> findAll() {
        return repository.findAll();
    }
}