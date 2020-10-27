package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmailController {
    @GetMapping("/showform")
    public String index (){
        return "create";
    }
   @PostMapping("/addEmail")
    public String getEmail(@RequestParam ("language") String language,
                           @RequestParam ("pagesize") String pagesize,
                           @RequestParam (required = false,value = "fillter") String fillter,
                           @RequestParam ("signature") String signature,
                           ModelMap modelMap){
       modelMap.addAttribute("language", language);
       modelMap.addAttribute("pagesize", pagesize);
       modelMap.addAttribute("fillter", fillter);
       modelMap.addAttribute("signature", signature);
       return "info";
   }

}
