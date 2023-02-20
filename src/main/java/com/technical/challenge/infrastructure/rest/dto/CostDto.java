package com.technical.challenge.infrastructure.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Builder
@Getter
public class CostDto {

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    LocalDateTime applicationDte;

}
