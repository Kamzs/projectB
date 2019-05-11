package kams.kamspoject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController
{

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ansewerGet ()
    {
        return "Categories";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ansewerGet ()
    {
        return "Category";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ansewerGet ()
    {
        return "Favourites";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ansewerGet ()
    {
        return "Gif-getails";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ansewerGet ()
    {
        return "Gif-getails";
    }


}
