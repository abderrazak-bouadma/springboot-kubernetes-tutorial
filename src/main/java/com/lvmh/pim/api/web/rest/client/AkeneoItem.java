package com.lvmh.pim.api.web.rest.client;

import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

import java.util.Date;

/**
 * Created by Abderrazak BOUADMA
 * on 26/03/2018.
 */
@Data
@JsonComponent(value = "item")
public class AkeneoItem {

    private String identifier;
    private String family;
    private boolean enabled;
    private Date created;
    private Date updated;
}
