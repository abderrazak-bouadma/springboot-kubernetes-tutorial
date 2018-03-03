package com.lvmh.pim.api.web.rest.controller;

import com.google.common.collect.Lists;
import com.lvmh.pim.api.web.rest.dto.ArticleReadDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 03/03/2018.
 */
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping
    public ResponseEntity<List<ArticleReadDto>> getAll() {

        ArrayList<ArticleReadDto> objects = Lists.newArrayList();
        ArticleReadDto a = new ArticleReadDto();
        a.setId("");
        a.setSku("sku");
        a.setName("j'adore");
        a.setDescription("perfume");
        objects.add(a);

        a = new ArticleReadDto();
        a.setId("2");
        a.setName("One");
        objects.add(a);

        a = new ArticleReadDto();
        a.setId("3");
        a.setName("Poison");
        objects.add(a);

        a = new ArticleReadDto();
        a.setId("4");
        a.setName("Sauvage");
        objects.add(a);

        a = new ArticleReadDto();
        a.setId("5");
        a.setName("Guerlin");
        objects.add(a);

        return ResponseEntity.ok(objects);
    }
}
