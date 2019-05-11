package kams.kamspoject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController
{

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ansewerGetCategories ()
    {
        return "Categories";
    }


    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String ansewerGetCategory()
    {
        return "Category";
    }


    @RequestMapping(value = "/2", method = RequestMethod.GET)
    public String ansewerGetFavourites ()
    {
        return "Favourites";
    }


    @RequestMapping(value = "/3", method = RequestMethod.GET)
    public String ansewerGetGifgetails ()
    {
        return "Gif-getails";
    }

    @RequestMapping(value = "/4", method = RequestMethod.GET)
    public String ansewerGetHome ()
    {
        return "Home";
    }


}
