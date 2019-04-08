package com.validator.quiz.controller;

import javax.validation.Valid;
import com.validator.quiz.model.Verb1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VerbController {

    @RequestMapping("/quiz")
    public String display(Model m)
    {
        m.addAttribute("verb", new Verb1());
        return "viewpage1";
    }
    @RequestMapping("/svar")
    public String submitForm(@Valid @ModelAttribute("verb") Verb1 v, BindingResult br)
    {
        if(br.hasErrors())
        {
            return "viewpage1";
        }
        else
        {
            return "final1";
        }
    }
}
