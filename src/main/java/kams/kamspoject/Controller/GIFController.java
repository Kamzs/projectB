package kams.kamspoject.Controller;


import kams.kamspoject.Model.Gif;
import kams.kamspoject.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/")
    public String reponseGetGifobjects(ModelMap modelMap)
    {
        //1. pobranie gifów do listy
        List<Gif> gifList = gifRepository.getAllGifs();

        //2. Przekazanie gifa do view
        modelMap.put("gifs",gifList);

        //3. zwrócenie widoku
        return "home";
    }

    @GetMapping("/favorites")
    public String reponseGetFavourites(ModelMap modelMap)
    {
        //1. pobranie gifów do listy
        List<Gif> gifList = gifRepository.getFavorited();

        //2. Przekazanie gifa do view
        modelMap.put("gifs",gifList);
        //3. zwrócenie widoku
        return "favorites";
    }

    @RequestMapping("/gif/{gifname}")
    public String responseGetOne(@PathVariable String gifname, ModelMap modelMap)
    {
        Gif gif = gifRepository.getGifByName(gifname);
        modelMap.put("gif",gif);
        return "gif-details";
    }

}
