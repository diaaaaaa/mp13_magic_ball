package at.refugeescode.mp13_magic_ball.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/magic_8_ball")
public class Magic8Controller {

    List<String> strings = Arrays.asList("phrase 1: Hi Mr. Alkhatib","phrase 2: We don't care ","phrase 3: Diaa","phrase 4: Nothing");

    @GetMapping
    String showPage(){

        return "magic_8_ball";
    }

    @ModelAttribute("phrase")
    String giveOneSentence(Model model)  {
        Collections.shuffle(strings);
        return strings.stream().findFirst().orElse(null);
    }

}
