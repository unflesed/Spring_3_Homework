package additional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyUuidController {

    @GetMapping(value = "/uuid")
    @ResponseBody
    public String getUuid(){
        MyUuid uuid = new MyUuid();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(uuid);
        return json;
    }
}
