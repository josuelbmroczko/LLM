package com.example.LLM.controler;

import dev.langchain4j.model.chat.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class OpenAIController {

    ChatModel chatModel;

    public OpenAIController(ChatModel chatModel){
        this.chatModel = chatModel;
    }

    @GetMapping
    public String chat(@RequestParam String mensagem){
        return chatModel.chat(mensagem);///RETORNA
    }//

}
