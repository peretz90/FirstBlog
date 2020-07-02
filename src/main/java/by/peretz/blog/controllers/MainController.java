package by.peretz.blog.controllers;

import by.peretz.blog.models.About;
import by.peretz.blog.repo.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MainController {

  @Autowired
  private AboutRepository aboutRepository;

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("title", "Главная страница");
    return "home";
  }

  @GetMapping("/about")
  public String about(Model model) {
    Iterable<About> abouts = aboutRepository.findAll();
    model.addAttribute("abouts", abouts);
    model.addAttribute("title", "Страница про нас");
    model.addAttribute("link", "На главную страницу");
    model.addAttribute("href", "/");
    return "about";
  }

  @PostMapping("/about")
  public String aboutAdd(@RequestParam String info, Model model) {
    About about = new About(info);
    aboutRepository.save(about);
    return "redirect:/about";
  }

  @GetMapping("/about/{id}")
  public String aboutDetails(@PathVariable(value = "id") long id, Model model) {
    if(!aboutRepository.existsById(id)) {
      return "redirect:/about";
    }
    Optional<About> about = aboutRepository.findById(id);
    ArrayList<About> result = new ArrayList<>();
    about.ifPresent(result :: add);
    model.addAttribute("about", result);
    model.addAttribute("title", "Про нас");
    return "about-details";
  }

  @GetMapping("/contact")
  public String contact(Model model) {
    model.addAttribute("title", "Контакты");
    return "contact";
  }

}
