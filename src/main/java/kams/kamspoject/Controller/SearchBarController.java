package kams.kamspoject.Controller;

import kams.kamspoject.Model.Gif;
import kams.kamspoject.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchBarController
{

    @Autowired
    GifRepository gifRepository;


    //widoki dla wyszukiwarki


    @PostMapping("/")
    public String responseGetOneFromBrowserHome(@RequestParam String q, ModelMap modelMap)
    {
        Gif gif = gifRepository.getGifByName(q);
        modelMap.put("gif",gif);

        if (gif == null){
            return "end";
        }
        else return "gif-details";
    }

    @PostMapping("/favorites")
    public String responseGetOneFromBrowserFavorites(@RequestParam String q, ModelMap modelMap)
    {
        Gif gif = gifRepository.getGifByName(q);
        modelMap.put("gif",gif);
        if (gif == null){
            return "end";
        }
        else return "gif-details";
    }

    @PostMapping("/categories")
    public String responseGetOneFromBrowserCategory(@RequestParam String q, ModelMap modelMap)
    {
        Gif gif = gifRepository.getGifByName(q);
        modelMap.put("gif",gif);
        if (gif == null){
            return "end";
        }
        else return "gif-details";
    }


}
