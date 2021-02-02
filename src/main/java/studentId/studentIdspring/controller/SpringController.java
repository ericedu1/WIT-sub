package studentId.studentIdspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import studentId.studentIdspring.student.Student;

@Controller
public class SpringController {

    @GetMapping("studentId")
    public String indexForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentId";
    }

    @PostMapping("/studentId")
    public String hello(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "showinfo";
    }
}
