package kams.kamspoject.Model;

public class Gif
{
    private String name;
    private String username;
    private Boolean isFavuorited;

    public Gif(String name, String username, Boolean isFavuorited)
    {
        this.name = name;
        this.username = username;
        this.isFavuorited = isFavuorited;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public Boolean getFavuorited()
    {
        return isFavuorited;
    }

    public void setFavuorited(Boolean favuorited)
    {
        isFavuorited = favuorited;
    }


}
