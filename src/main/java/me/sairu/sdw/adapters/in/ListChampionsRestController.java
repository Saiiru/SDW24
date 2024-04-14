package me.sairu.sdw.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.sairu.sdw.application.ListChampionsUseCase;
import me.sairu.sdw.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ListChampionsRestController
 */
@Tag(name = "Campeões", description = "Endpoint LoL Champions" )
@RestController
@RequestMapping("/api/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions(){
        return useCase.findAll();
    }

}