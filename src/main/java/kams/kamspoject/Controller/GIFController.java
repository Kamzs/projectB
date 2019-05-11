package kams.kamspoject.Controller;


import kams.kamspoject.Model.Gif;
import kams.kamspoject.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @GetMapping("/Gifobject")
    @ResponseBody
    public String reponseGetGifobjects()
    {
        //1. pobranie gifów do listy
        List<Gif> gifList = gifRepository.getAllGifs();
        //2. zwrócenie widoku
        return gifRepository.getAllGifs().toString();
    }

}
