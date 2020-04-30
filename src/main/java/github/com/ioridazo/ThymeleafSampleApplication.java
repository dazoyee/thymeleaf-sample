package github.com.ioridazo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class ThymeleafSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSampleApplication.class, args);
    }

    @GetMapping("")
    public String index(Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("a", "alpha");
        map.put("b", "beta");
        map.put("c", "gamma");

        model.addAttribute("value", "oiso");
        model.addAttribute("entries", map);

        System.out.println(map.get("d"));

        return "index.html";
    }

}
