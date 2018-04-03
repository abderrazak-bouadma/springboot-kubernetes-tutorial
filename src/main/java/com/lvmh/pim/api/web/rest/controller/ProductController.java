package com.lvmh.pim.api.web.rest.controller;

import com.google.common.collect.Lists;
import com.lvmh.pim.api.web.rest.client.AkeneoItem;
import com.lvmh.pim.api.web.rest.client.AkeneoProductClient;
import com.lvmh.pim.api.web.rest.dto.ArticleReadDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 03/03/2018.
 */
@RestController
@RequestMapping("/products")
@Api(value = "PIM Products API", tags = "pim-service")
public class ProductController {

    @Autowired
    AkeneoProductClient akeneoProductClient;

    @ApiOperation(value = "returns all products of the actual PIM. data is paginated")
    @GetMapping
    public ResponseEntity<List<ArticleReadDto>> getAll() {

        Resources<AkeneoItem> products = akeneoProductClient.getProducts();
        products.getContent().forEach(p -> System.out.println(p.getIdentifier()));

        // include swagger documentation

        // use spring-cloud-feign client for the akeneo api call
        return ResponseEntity.ok(Lists.newArrayList());
    }
}
