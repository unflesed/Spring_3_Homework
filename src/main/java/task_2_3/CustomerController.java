package task_2_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @GetMapping(value = "/input")
    public ModelAndView customer(){
        return new ModelAndView("input", "command", new Customer());
    }
    @PostMapping(value = "/success")
    public String write(@ModelAttribute("SpringWeb") Customer customer, Model model){
        model.addAttribute("count", File.write(customer));
        return "success";
    }
    @PostMapping(value = "/output")
    public String read(@ModelAttribute("SpringWeb") Customer customer, Model model){
        model.addAttribute("text", File.read());
        return "output";
    }
}
