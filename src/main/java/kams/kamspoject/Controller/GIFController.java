package kams.kamspoject.Controller;


import kams.kamspoject.Model.Gif;
import kams.kamspoject.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GIFController
{

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/show")
    @ResponseBody
    public String reponseGetShow()
    {
        return gifRepository.returnNames();
    }

}
