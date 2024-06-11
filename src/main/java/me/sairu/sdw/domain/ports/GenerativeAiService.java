package me.sairu.sdw.domain.ports;

import org.springframework.stereotype.Service;

@Service

public interface GenerativeAiService {

    String generateContent(String objective, String context);
}
