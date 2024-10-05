package com.newtonn.clgms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollegeDto {
    private Short collegeCode;
    private String collegeName;
    private String district;
    private String region;
    private String collegeType;
}
