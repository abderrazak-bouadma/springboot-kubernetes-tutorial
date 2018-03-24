package com.lvmh.pim.api.web.rest.controller;

import com.google.common.collect.Lists;
import com.lvmh.pim.api.web.rest.dto.ArticleReadDto;
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
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping
    public ResponseEntity<List<ArticleReadDto>> getAll() {

        // include swagger documentation

        // use spring-cloud-feign client for the akeneo api call
        return ResponseEntity.ok(Lists.newArrayList());
    }
}
