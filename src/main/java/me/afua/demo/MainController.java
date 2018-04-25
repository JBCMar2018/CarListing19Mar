/*
There are 12 errors to find
original code is at https://github.com/JBCMar2018/CarListing19Mar
*/


package me.afua.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


public class MainController {




    public String showIndex(Model model)
    {

        Car aCar = new Car();
        aCar.setModel("C Class");
        aCar.setBrand("Mercedes");
        aCar.setColour("Silver");
        aCar.setAvailable(true);
        aCar.setImage("https://bit.ly/2voYWyw");
        carRepo.save(aCar);


        aCar = new Car();
        aCar.setModel("WRX");
        aCar.setBrand("Subaru");
        aCar.setImage("https://bit.ly/2qJyScR");
        aCar.setAvailable(false);
        aCar.setColour("Red");
        carRepo.save(aCar);

        model.addAttribute("cars",carRepo.findAll());
        return "home";
    }

    @RequestMapping("/divlist")
    public String showDivList()
    {
        model.addAttribute("cars",carRepo.findAll());
        return "divlist";
    }
    @RequestMapping("/table")
    public String showableList(Model model)
    {
        model.addAttribute("cars",carRepo.findAll());
        return "tablelist";
    }
}
