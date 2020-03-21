package com.vladis1350.controllers;

import com.vladis1350.bean.Product;
import com.vladis1350.enumCategory.Category;
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
    private ProductService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        Iterable<Product> products = service.findAll();
        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductsForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "new_product";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductsForm(@PathVariable(name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("edit_product");
        Product product = service.getById(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String showProduct(@ModelAttribute("product") Product product) {
        if (ProductValidator.checkValidateDataProduct(product)) {
            service.save(product);
        } else {
            return "error";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.POST)
    public String clearFilterAndSearch() {
        return "redirect:/";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchProductById(@ModelAttribute("product") Product product, Model model) {
        Product product1 = service.getById(product.getId());
        System.out.println(product.getCategory());
        model.addAttribute("products", product1);
        return "index";
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public String filterProductByCategory(@ModelAttribute("category") Category category, Model model) {
        List<Product> productList = service.findAllByCategory(category);
        System.out.println(category);
        model.addAttribute("products", productList);
        return "index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProducts(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/set")
    public String showSetDiscountForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "set_discount";
    }

    @RequestMapping(value = "/setDiscount", method = RequestMethod.POST)
    public String setDiscountForCategory(@ModelAttribute("product") Product product, BigDecimal discount) {
        service.setDiscountForCategory(product.getCategory(), discount);
        return "redirect:/";
    }



}
