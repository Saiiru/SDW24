package me.sairu.sdw.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {
    public String generateContextByQuestion(String question){
        return """
            Nome do campeao: %s,
            Funçao: %s,
            Lore: %s,                   
        """.formatted(this.name, this.role, this.lore);
    }
}
