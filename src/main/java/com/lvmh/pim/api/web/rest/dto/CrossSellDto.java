package com.lvmh.pim.api.web.rest.dto;

import lombok.Data;

/**
 * Created by Abderrazak BOUADMA
 * on 23/03/2018.
 */
@Data
public class CrossSellDto {
    private String nameCrossSellEretail;
    private String yCrossSell;
    private String gencodeCrossSellEretail;
    private String nameCrossSellUs;
    private String gencodeCrossSellRelatedItemUs;
}
