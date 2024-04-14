package me.sairu.sdw.application;

import me.sairu.sdw.domain.exception.ChampionNotFoundException;
import me.sairu.sdw.domain.model.Champion;
import me.sairu.sdw.domain.ports.ChampionsRepository;

public record AskChampionUseCase (ChampionsRepository repository) {
    public String askChampion(Long championId, String question){

        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContext = champion.generateContextByQuestion(question);

        // TODO: Evolve the logic to integrate generative AI
        return championContext;
    }
}
