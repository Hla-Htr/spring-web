package T3H.QuanLyBanGiay.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = "/show")
    public ModelAndView showHome()
    {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}
