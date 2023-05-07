package ico.fes.intro.controller;

import ico.fes.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

@Controller
public class principal {

    @GetMapping("/inicio")
    public String getInicio(Model model){
        Empleado emp = new Empleado("Juan Lopez",45,35000,"Desarrollo", "26/10/2002");
        model.addAttribute("empleado", emp);
        return "index";
    }
}
