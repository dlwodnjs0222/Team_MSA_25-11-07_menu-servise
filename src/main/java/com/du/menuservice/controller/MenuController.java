package com.du.menuservice.controller;

import com.du.menuservice.entity.Menu;
import com.du.menuservice.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("menuList", menuService.findAll());
        return "menu";
    }

    @GetMapping("/menu/coffee")
    public String coffee(String coffee, Model model) {
        model.addAttribute("coffeeList", menuService.findByCoffee(coffee));
        return "coffee";
    }

    @GetMapping("/menu/tea")
    public String tea(String tea, Model model) {
        model.addAttribute("teaList", menuService.findByTea(tea));
        return "tea";
    }

    @GetMapping("/menu/shake")
    public String menuShake(String shake, Model model) {
        model.addAttribute("shake", menuService.findByShake(shake));
        return "shake";
    }

    @GetMapping("/menu/ade")
    public String menuAe(String ade, Model model) {
        model.addAttribute("ade", menuService.findByAde(ade));
        return "ade";
    }

    @GetMapping("/menu/smoothie")
    public String menuSmoothie(String smoothie, Model model) {
        model.addAttribute("menu", menuService.findBySmoothie(smoothie));
        return "smoothie";
    }

    @GetMapping("/menu/decaffeination")
    public String menuDecaffeination(String decaffeination, Model model) {
        model.addAttribute("menu", menuService.findByDecaffeination(decaffeination));
        return "decaffe";
    }

    @GetMapping("/menu/drink")
    public String menuDrink(String drink, Model model) {
        model.addAttribute("menu", menuService.findByDrink(drink));
        return "drink";
    }

    @GetMapping("/menu/newOne")
    public String menuNewOne(String newOne, Model model) {
        model.addAttribute("menu", menuService.findByNewOne(newOne));
        return "newOne";
    }

    @GetMapping("/menu/extra")
    public String menuExtra(String extra, Model model) {
        model.addAttribute("menu", menuService.findByExtra(extra));
        return "extra";
    }

    @PostMapping("/menu")
    public String saveMenu(Menu menu) {
        menuService.save(menu);
        return "redirect:/";
    }

}
