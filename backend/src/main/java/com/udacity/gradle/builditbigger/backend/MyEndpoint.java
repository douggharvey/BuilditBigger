package com.udacity.gradle.builditbigger.backend;

import com.douglasharvey.jokeprovider.JokeTeller;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@SuppressWarnings("DefaultAnnotationParam")
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getRandomJoke")
    public MyBean getRandomJoke() {
        MyBean response = new MyBean();
        JokeTeller jokeTeller = new JokeTeller();
        response.setData(jokeTeller.getRandomJoke());
        return response;
    }

}
