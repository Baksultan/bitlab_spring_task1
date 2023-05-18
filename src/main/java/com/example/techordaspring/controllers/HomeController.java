package com.example.techordaspring.controllers;


import com.example.techordaspring.db.DBManager;
import com.example.techordaspring.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("students", DBManager.getAllStudents());
        return "home";
    }

    @GetMapping("/add-student")
    public String addStudentPage() {
        return "add-student";
    }

    @PostMapping("/add-student")
    public String addStudent(Student student) {
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
