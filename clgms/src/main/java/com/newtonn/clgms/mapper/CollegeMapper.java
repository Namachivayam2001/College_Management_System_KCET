package com.newtonn.clgms.mapper;

import com.newtonn.clgms.dto.CollegeDto;
import com.newtonn.clgms.model.College;

public class CollegeMapper {
    public static CollegeDto mapToCollegeDto(College college){
        return new CollegeDto(
                college.getCollegeCode(),
                college.getCollegeName(),
                college.getDistrict(),
                college.getRegion(),
                college.getCollegeType()
        );
    }
    public static College mapToCollege(CollegeDto collegeDto){
        return new College(
                collegeDto.getCollegeCode(),
                collegeDto.getCollegeName(),
                collegeDto.getDistrict(),
                collegeDto.getRegion(),
                collegeDto.getCollegeType()
        );
    }
}
