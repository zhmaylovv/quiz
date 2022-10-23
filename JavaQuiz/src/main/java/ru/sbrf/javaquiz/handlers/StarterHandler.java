package ru.sbrf.javaquiz.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.javaquiz.data.QuestionRepository;
import ru.sbrf.javaquiz.model.Question;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StarterHandler {

    private final QuestionRepository repository;

    @Autowired
    public StarterHandler(QuestionRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/hello")
    public String startHear() {
        return "Hello World";
    }

    @GetMapping("/list")
    public String getListofQuestion(){
        List<Question> list = repository.findAll();
        return list.stream()
                .map(Question::toString)
                .collect(Collectors.joining("\n"));
    }
}
