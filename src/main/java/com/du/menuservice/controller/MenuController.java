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
        model.addAttribute("menus", menuService.findAll());
        return "menu";
    }

    @GetMapping("/menu/new")
    public String form(Model model) {
        model.addAttribute("menu", new Menu());
        return "form";
    }

    @PostMapping("/menu")
    public String save(Menu menu) {
        menuService.save(menu);
        return "redirect:/";
    }

    @GetMapping("/menu/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Menu menu = menuService.findById(id).orElseThrow();
        model.addAttribute("menu", menu);
        return "list";
    }

    @GetMapping("/menu/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Menu menu = menuService.findById(id).orElseThrow();
        model.addAttribute("menu", menu);
        return "form";
    }

    @GetMapping("/menu/del/{id}")
    public String delete(@PathVariable Long id, Model model) {
        menuService.deleteById(id);
        return "redirect:/";
    }
}
