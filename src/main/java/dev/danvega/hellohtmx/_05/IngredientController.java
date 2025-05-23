package dev.danvega.hellohtmx._05;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;


    @Controller
    @RequestMapping("05")
    public class IngredientController {


        @GetMapping(value = "", produces = MediaType.TEXT_HTML_VALUE)
        public String index(Model model) throws Exception {
            ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
            ingredients.add(new Ingredient("Milk", "1", Unit.CUP.abbreviation()));
            model.addAttribute("ingredients", ingredients);
            return "05/index";
        }


        @GetMapping("/addRow")
        public String addRow(Model model) throws Exception {
            //ingredients.add(new Ingredient("Chicken", "1500", Unit.GRAMS.abbreviation()));
            model.addAttribute("ingredients", new Ingredient(" ", " ", " "));
            return "05/ingredient-row :: ingredient-rows";
        }

    }

