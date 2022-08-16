package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

import java.time.ZoneId;
@OpenAPIDefinition(
        info = @Info(
                title = "Hello World",
                version = "42",
                description = "This is it. The answer to life , the universe and everyting",
                license = @License(name = "Apache 2.0", url = "https://foo.bar"),
                contact = @Contact(url = "https://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
        )
)
@Controller(value = "/exemplars")
public class TheController
{
    @Post
    Exemplar create(@Body Exemplar toBeCreated)
    {
        return Exemplar.of().zoneId(ZoneId.of("America/New_York")).build();
    }
}
