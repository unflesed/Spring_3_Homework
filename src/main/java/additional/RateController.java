package additional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class RateController {

    @GetMapping(value = "/exchange")
    @ResponseBody
    public String getRandomRate() throws IOException {
        return Parser.getRandomCourse();
    }
    @GetMapping(value = "/exchange/{currency}")
    @ResponseBody
    public String getRate(@PathVariable String currency) throws IOException {
        return Parser.getParticularRate(currency);
    }
}
