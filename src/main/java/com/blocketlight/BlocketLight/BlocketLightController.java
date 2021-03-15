package com.blocketlight.BlocketLight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller

public class BlocketLightController {


    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/")
    public String loginGet(Model model) {
        List<Item> list = itemRepository.getList();
        model.addAttribute("items", list);

        return "index";
    }

    @GetMapping("/{id}")
    public String detailPage(Model model, @PathVariable int id) {
        Item item = itemRepository.getItem(id);
        model.addAttribute("item", item);
        return "detailPage";
    }

    @GetMapping("/listItems")
    public String listItems(Model model) {
        List<Item> list = itemRepository.getList();
        model.addAttribute("items", list);

        return "listItems";
    }

    @GetMapping("/addItem")
    public String addItems(Model model) {
        List<Item> list = itemRepository.getList();
        model.addAttribute("items", list);

        return "addItem";
    }

    @PostMapping("/save")
    public String set(Model model) {

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model) {


        return "login";

    }
    @GetMapping("/register")
    public String register(Model model) {


        return "register";

    }

    @GetMapping("/forgot")
    public String forgot(Model model) {


        return "forgot";

    }
}
