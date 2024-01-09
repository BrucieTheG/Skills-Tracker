package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsController {

    @GetMapping
    public String skillTracker () {
        return "<html>" +
                "<body>" +
                "<h1> Skill Tracker </h1>" +
                "<h2> A few skills you should learn </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> Python </li>" +
                "<li> C++ </li>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String skillForm(){
        return  "<html>" +
                "<body>" +
                "<form action = 'Name' method = 'post >" +
                "<label for='fname'>First name:</label>" +
                "<input type='text' id='fname' name='fname'><br>" +
                "<label for='My Favorite Code'>Choose a code:</label>" +
                "<select name='Language' id='code-select'>" +
                "<option value='Java'>java</option>" +
                "<option value='Python'>python</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" + "<br> <br>"+

                "<label for='Second Favorite Code'>Choose a code:</label>" +
                "<select name='Language' id='code-select'>" +
                "<option value='Java'>java</option>" +
                "<option value='Python'>python</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" + "<br> <br>"+

                "<label for='Third Favorite Code'>Choose a code:</label>" +
                "<select name='Language' id='code-select'>" +
                "<option value='Java'>java</option>" +
                "<option value='Python'>python</option>" +
                "<option value='C++'>C++</option>" +
                "</select>";
    }
}
