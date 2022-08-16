package com.example;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZoneId;

@Getter
@Setter
@Builder(builderMethodName = "of")
@Schema(name = "exemplar")
public class Exemplar
{
    @Schema(name="zone_id", type = "string")
    private ZoneId zoneId;

}
