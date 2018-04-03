package com.lvmh.pim.api.config;

import com.lvmh.pim.api.web.rest.client.AkeneoProductClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

/**
 * Created by Abderrazak BOUADMA
 * on 26/03/2018.
 */
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@EnableFeignClients(clients = {AkeneoProductClient.class})
@Configuration
public class AkeneoClientConfig {
}
