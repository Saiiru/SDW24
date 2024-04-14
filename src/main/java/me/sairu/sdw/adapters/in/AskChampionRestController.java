package me.sairu.sdw.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.sairu.sdw.application.AskChampionUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * AskChampionsRestController
 */
@Tag(name = "Campeões", description = "Endpoint LoL Champions" )
@RestController
@RequestMapping("/api/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampion(@PathVariable Long championId, @RequestBody AskChampionRequest request){

        String answer = useCase.askChampion(championId, request.question());

        return new AskChampionResponse(answer);
    }

    /**
     * DTOS
     */
    public record AskChampionRequest(String question){}

    public record AskChampionResponse(String answer) {}
}
