package com.mpalourdio.html5.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * Created by louchen on 2017/6/28.
 */
@Component
public class CustomRepositoryRestConfigurerAdapter extends RepositoryRestConfigurerAdapter {

    private static final String API_PATH = "/api";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setBasePath(API_PATH);
    }

}
