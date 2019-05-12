package kams.kamspoject.Model.Repository;

import kams.kamspoject.Model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository
{

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(

            new Category(0,"funny"),
            new Category(1,"sport"),
            new Category(2,"stupid")

    );

    public List<Category> getAllCategories()
    {
        return ALL_CATEGORIES;
    }
}
