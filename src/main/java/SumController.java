import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SumController {

    @RequestMapping(value = "/add/first/{first}/second/{second}", method = RequestMethod.GET)
    public String addNumbers(@PathVariable Integer first, @PathVariable Integer second) {
        return String.valueOf(first + second);
    }



}
