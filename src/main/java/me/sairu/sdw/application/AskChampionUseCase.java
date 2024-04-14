package me.sairu.sdw.application;

import me.sairu.sdw.domain.exception.ChampionNotFoundException;
import me.sairu.sdw.domain.model.Champion;
import me.sairu.sdw.domain.ports.ChampionsRepository;
import me.sairu.sdw.domain.ports.GenerativeAiService;

public record AskChampionUseCase(ChampionsRepository repository, GenerativeAiService genAIApi) {
    public String askChampion(Long championId, String question) {

        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String context = champion.generateContextByQuestion(question);

        String objective = """
                Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).
                Responsa perguntas incorporando a personalidade e estilo de um determinado Campeão.
                Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                                
                """;


        return genAIApi.generateContent(objective, context);
    }
}
