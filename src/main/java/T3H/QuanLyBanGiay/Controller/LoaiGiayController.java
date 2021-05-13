package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Model.LoaiGiay;
import T3H.QuanLyBanGiay.Servier.ILoaiGiayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("loaigiay")
public class LoaiGiayController {
    @Autowired
    ILoaiGiayService iLoaiGiayService;

    @RequestMapping("/getall")
    @ResponseBody
    public List<LoaiGiay> getAll()
    {
        return iLoaiGiayService.getAll();
    }
}
