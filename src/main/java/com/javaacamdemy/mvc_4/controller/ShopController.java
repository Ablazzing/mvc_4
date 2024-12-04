package com.javaacamdemy.mvc_4.controller;

import com.javaacamdemy.mvc_4.Color;
import com.javaacamdemy.mvc_4.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.javaacamdemy.mvc_4.service.ShopService;

import java.math.BigDecimal;

@Controller
@RequestMapping("/shop")
public class ShopController {
    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @GetMapping
    public String getShopView(Model model) {
        BigDecimal applePrice = service.getPriceByProductName("apple");
        model.addAttribute("applePrice", applePrice);
        return "shop";
    }

    @GetMapping("/self-price")
    public String getSelfPriceView() {
        return "self_price";
    }

    @PostMapping
    public void saveProduct(@RequestBody ProductDto productDto) {
        service.saveNewProduct(productDto);
    }

    @GetMapping("/owner")
    @ResponseBody
    public ResponseEntity<String> getOwnerName() {
        return ResponseEntity.status(203).body("Anbu");
    }
}
