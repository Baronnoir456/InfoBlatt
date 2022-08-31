package com.lars.infoblatt;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class InfoBlattController {

    private final InfoBlattService infoBlattService;

    public InfoBlattController(InfoBlattService infoBlattService){
        this.infoBlattService = infoBlattService;
    }

    @GetMapping("/info")
    public String infoForm(Model model){
        model.addAttribute("infoBlatt",new InfoBlatt());
        return "infoBlatt";
    }

    @PostMapping("/info")
    public String infoSubmit(@ModelAttribute InfoBlatt infoBlatt , Model model){
        model.addAttribute("infoblatt",infoBlatt);
        infoBlattService.saveInfoblatt(infoBlatt);
        return "infoBlattReturn";
    }

    @GetMapping("/data")
    public String dataList(Model model){
        List<InfoBlatt> datalist = infoBlattService.showinfoBlatt();
        model.addAttribute("dataList",datalist);
        return "dataOutput";
    }

    @GetMapping("/delete/{id}")
    public String deleteInfoBlatt(@PathVariable Long id, Model model){
        infoBlattService.deleteInfoBlatt(id);
        return "redirect:/data";
    }

    @GetMapping("/")
    public String startseite(){
        return "home";
    }






}
