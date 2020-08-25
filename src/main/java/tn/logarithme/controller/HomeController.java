package tn.logarithme.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.logarithme.dao.ProductDoa;
import tn.logarithme.model.Product;

import java.util.List;

@Controller
public class  HomeController {
    private ProductDoa productDoa = new ProductDoa();


    @RequestMapping("/")
    public String Home() {


        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model) {

        List<Product> products = productDoa.getProductList();

        model.addAttribute("products", products);
        return "productList";
    }


}
