package com.lvmh.pim.api.web.rest.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by Abderrazak BOUADMA
 * on 03/03/2018.
 */
@Data
public class ArticleReadDto {

    private String sku;
    private String language;
    private Map<String, String> productType;
    private String gender;
    private String age;
    private String whatItIs;
    private String reasonsWhyProductUnique;
    private String websiteProductCategorization;
    private List<CrossSellDto> crossSell;
    private String fragrance;

}
