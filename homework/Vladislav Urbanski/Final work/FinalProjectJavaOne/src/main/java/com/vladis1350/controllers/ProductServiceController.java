package com.vladis1350.controllers;

import com.vladis1350.bean.Category;
import com.vladis1350.bean.Product;
import com.vladis1350.services.CategoryService;
import com.vladis1350.services.ProductService;
import com.vladis1350.validate.ProductValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class ProductServiceController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        Iterable<Product> products = productService.findAll();
        model.addAttribute("products", products);
        model.addAttribute("categories", categoryService.findAll());
        return "index";
    }

    @RequestMapping("/newCategory")
    public String showNewCategoryForm(Model model) {
        Category category = new Category();
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("category", category);
        return "category_form";
    }

    @RequestMapping("/new")
    public String showNewProductsForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("categories", categoryService.findAll());
        return "new_product";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductsForm(@PathVariable(name = "id") Long id, Model model) {
        ModelAndView modelAndView = new ModelAndView("edit_product");
        Product product = productService.getById(id);
        model.addAttribute("categories", categoryService.findAll());
        modelAndView.addObject("product", product);
        return modelAndView;
    }


    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public String showCategory(@ModelAttribute("category") Category category, Model model) {
        categoryService.save(category);

        return showNewCategoryForm(model);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String showProduct(@ModelAttribute("product") Product product, Model model) {
        if (ProductValidator.checkValidateDataProduct(product)) {
            productService.save(product);
        } else {
            return "error";
        }
        return viewHomePage(model);
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.POST)
    public String clearFilterAndSearch() {
        return "redirect:/";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchProductById(@ModelAttribute("product") Product product, Model model) {
        Product product1 = productService.getById(product.getId());
        System.out.println(product.getCategory());
        model.addAttribute("products", product1);
        return "index";
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public String filterProductByCategory(@ModelAttribute("category") String category, Model model) {
        List<Product> productList = productService.findAllByCategory(category);
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("products", productList);
        return "index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProducts(@PathVariable(name = "id") Long id) {
        productService.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/set")
    public String showSetDiscountForm(Model model) {
        Product product = new Product();
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("product", product);

        return "set_discount";
    }

    @RequestMapping(value = "/setDiscount", method = RequestMethod.POST)
    public String setDiscountForCategory(@ModelAttribute("product") Product product, BigDecimal discount, Model model) {
        productService.setDiscountForCategory(product.getCategory(), discount);
        return "redirect:/";
    }

}
