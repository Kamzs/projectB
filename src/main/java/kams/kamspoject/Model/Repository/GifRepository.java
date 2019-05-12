package kams.kamspoject.Model.Repository;

import kams.kamspoject.Model.Gif;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class GifRepository
{
    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion","sad",true),
            new Gif("ben-and-mike","dsa",false),
            new Gif("book-dominos","ewq",true),
            new Gif("compiler-bot","freq",false),
            new Gif("cowboy-coder","qaz",false),
            new Gif("infinite-andrew","deca",true)

    );

    public List<Gif> getAllGifs()
    {
        return ALL_GIFS;
    }

    public List<Gif> getFavorited()
    {
        List<Gif> onlyFavorited = new ArrayList<>();

        for (int i = 0; i < ALL_GIFS.size(); i++)
        {
            if (ALL_GIFS.get(i).getFavorite()==true)
            onlyFavorited.add(ALL_GIFS.get(i));
        }

        return onlyFavorited;
    }

    public String returnNames ()
    {
        String names = "";
        for (Gif gif :ALL_GIFS )
        {
            names += gif.getName();
        }
        return  names;
    }

}
