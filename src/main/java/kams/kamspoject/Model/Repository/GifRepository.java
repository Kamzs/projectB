package kams.kamspoject.Model.Repository;

import kams.kamspoject.Model.Gif;

import java.util.Arrays;
import java.util.List;

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

}
