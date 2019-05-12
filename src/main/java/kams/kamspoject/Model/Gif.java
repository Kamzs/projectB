package kams.kamspoject.Model;


public class Gif
{
    private String name;
    private String username;
    private Boolean Favorite;
    private int categoryID;


    public Gif(String name, String username, Boolean isFavuorited, int categoryID)
    {
        this.name = name;
        this.username = username;
        this.Favorite = isFavuorited;
        this.categoryID = categoryID;
    }

    public int getCategoryID()
    {
        return categoryID;
    }

    public void setCategoryID(int categoryID)
    {
        this.categoryID = categoryID;
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

    public Boolean getFavorite()
    {
        return Favorite;
    }

    public void setFavorite(Boolean favuorited)
    {
        Favorite = favuorited;
    }


}
