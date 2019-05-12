package kams.kamspoject.Controller;


import kams.kamspoject.Model.Category;
import kams.kamspoject.Model.Gif;
import kams.kamspoject.Model.Repository.CategoryRepository;
import kams.kamspoject.Model.Repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoriesController
{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/categories")
    public String responseGetCategories(ModelMap modelMap)
    {
        List<Category> listOfCategories =categoryRepository.getAllCategories();

        modelMap.put("categories",listOfCategories);

        return "categories";

    }

    @RequestMapping("/category/{id}")
    public String responseAllCategories(@PathVariable int id, ModelMap modelMap)
    {
        //1. metoda pobiera listę liste gifów z konkretnym id kategorii
        List<Gif> gifsByCategory = gifRepository.getGifsyCategoryID(id);

        //2. Pobranie kategorii po id
        Category category = categoryRepository.getCategoryByID(id);

        modelMap.put("gifs",gifsByCategory);
        modelMap.put("category",category);


        return "category";

    }
}
