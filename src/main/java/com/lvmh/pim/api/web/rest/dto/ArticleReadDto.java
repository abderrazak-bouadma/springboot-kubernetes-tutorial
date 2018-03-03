package com.lvmh.pim.api.web.rest.dto;

import lombok.Data;

/**
 * Created by Abderrazak BOUADMA
 * on 03/03/2018.
 */
@Data
public class ArticleReadDto {

    private String id;
    private String sku;
    private String name;
    private String description;
}
