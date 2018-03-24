package com.lvmh.pim.api.web.rest.dto;

import lombok.Data;

import java.util.Map;

/**
 * Created by Abderrazak BOUADMA
 * on 23/03/2018.
 */
@Data
public class FragranceDto {

    private String fragTypePackaging;
    private String olfactiveFamily;
    private String olfactiveSubfamily;
    private Map<String,String> olfactiveNotes;
    private String perfumerName;
    private String creationDate;
    private String juiceColour;
    private String bottleColour;
    private String fragranceConcentration;
    private Map<String, String> descriptions;

}
