package com.intelligence.retail.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FaceSearchResDto {
    private String faceId;
    private String name;
    private Integer similarValue;
    private Integer age;
    private String gender;
    private String image;

}
