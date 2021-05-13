package T3H.QuanLyBanGiay.Controller;


import T3H.QuanLyBanGiay.Model.Giay;
import T3H.QuanLyBanGiay.Servier.IGiayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping( "/giay")
public class GiayController {
    @Autowired
    private IGiayService iGiayService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView Index(){
        ModelAndView modelAndView = new ModelAndView("Admin/giay/index");

        modelAndView.addObject("items", iGiayService.getAll());

        return modelAndView;
    }

    @RequestMapping(value ="/create",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView create(){

        ModelAndView modelAndView = new ModelAndView("/giay/create");

        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView create(@ModelAttribute Giay shoe){
        ModelAndView modelAndView = new ModelAndView("/Admin/giay/index");
        System.out.println(shoe);
        System.out.println(shoe.getTenGiay());

        iGiayService.add(shoe);
        return modelAndView;
    }

    @RequestMapping(value = "/getsinglebyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Giay getbyid(String id)
    {
        Giay giay = iGiayService.getByID(id);
        System.out.println("ID:" + id);
        return giay;
    }

    @RequestMapping(value = "add")
    public ModelAndView add()
    {
        ModelAndView mcv = new ModelAndView("/Admin/giay/Add");
        return mcv;
    }
    @RequestMapping("/getall")
    @ResponseBody
    public List<Giay> showTable()
    {
        return iGiayService.getAll();
    }
}
