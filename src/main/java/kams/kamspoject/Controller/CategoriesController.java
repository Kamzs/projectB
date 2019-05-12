package kams.kamspoject.Controller;


import kams.kamspoject.Model.Category;
import kams.kamspoject.Model.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoriesController
{
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    String responseGetCategories(ModelMap modelMap)
    {
        List<Category> listOfCategories =categoryRepository.getAllCategories();

        modelMap.put("categories",listOfCategories);

        return "categories";

    }
}
