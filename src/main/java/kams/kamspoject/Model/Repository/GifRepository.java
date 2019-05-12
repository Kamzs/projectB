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
            new Gif("android-explosion", "sad", true, 0),
            new Gif("ben-and-mike", "dsa", false, 0),
            new Gif("book-dominos", "ewq", true, 0),
            new Gif("compiler-bot", "freq", false, 1),
            new Gif("cowboy-coder", "qaz", false, 2),
            new Gif("infinite-andrew", "deca", true, 2)

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
            if (ALL_GIFS.get(i).getFavorite() == true)
                onlyFavorited.add(ALL_GIFS.get(i));
        }

        return onlyFavorited;
    }


    public List<Gif> getGifsyCategoryID(int numberCategory)
    {
        List<Gif> withCategory0 = new ArrayList<>();

        for (int i = 0; i < ALL_GIFS.size(); i++)
        {
            if (ALL_GIFS.get(i).getCategoryID() == numberCategory)
                withCategory0.add(ALL_GIFS.get(i));
        }

        return withCategory0;
    }

    public String returnNames()
    {
        String names = "";
        for (Gif gif : ALL_GIFS)
        {
            names += gif.getName();
        }
        return names;
    }

    public Gif getGifByName(String name)
    {
        for (Gif gif : ALL_GIFS)

            if (name.equals(gif.getName()))
            {
                return gif;
            }

                return null;

    }
}
