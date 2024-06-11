package me.sairu.sdw.domain.ports;

import me.sairu.sdw.domain.model.Champion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChampionsRepository {

    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}