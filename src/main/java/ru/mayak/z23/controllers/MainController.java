package ru.mayak.z23.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mayak.z23.domain.Answer;
import ru.mayak.z23.domain.Question;
import ru.mayak.z23.domain.User;
import ru.mayak.z23.repositories.QBlocksRepository;
import ru.mayak.z23.repositories.QuestionRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private QBlocksRepository blocksRepository;
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/form")
    public String form(@AuthenticationPrincipal User user, Model model) throws Exception {
        List<Answer> answers = new ArrayList<>();
        for (Question question: questionRepository.findAll()) {
            Answer answer = new Answer();
            answer.setQuestion(question);
            answer.setValue(null);
            answers.add(answer);
        }
        model.addAttribute("user", user);
        model.addAttribute("blocks", blocksRepository.findAll());
        model.addAttribute("answers", answers);
        return "form";
    }
}
