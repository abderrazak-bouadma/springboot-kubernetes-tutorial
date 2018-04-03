package com.lvmh.pim.api.web.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Abderrazak BOUADMA
 * on 26/03/2018.
 */

@FeignClient(name = "akeneo-api")
@Component
public interface AkeneoProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    Resources<AkeneoItem> getProducts();

}
