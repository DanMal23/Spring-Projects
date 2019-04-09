package com.validator.quiz.controller;

import javax.validation.Valid;
import com.validator.quiz.model.Verb1;
import com.validator.quiz.model.Verb2;
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

    @RequestMapping("/quiz2")
    public String display2(Model m)
    {
        m.addAttribute("verb2", new Verb2());
        return "viewpage2";
    }

    @RequestMapping("/svar2")
    public String submitForm2(@Valid @ModelAttribute("verb2") Verb2 v, BindingResult br)
    {
        if(br.hasErrors())
        {
            return "viewpage2";
        }
        else
        {
            return "final2";
        }
    }
}
