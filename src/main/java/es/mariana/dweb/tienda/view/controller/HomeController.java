package es.mariana.dweb.tienda.view.controller;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar cal = Calendar.getInstance();
        model.addAttribute("today", dateFormat.format(cal.getTime()));

        Faker faker = new Faker(new Locale("es"));
        model.addAttribute("name", faker.name().firstName());
        return "home";
    }


    @GetMapping("/home1")
    public String home1() {
        return "home1";
    }


    @GetMapping("/home2")
    public String home2() {
        return "home2";
    }

}