package com.newtonn.clgms.service.impl;

import com.newtonn.clgms.dto.CollegeDto;
import com.newtonn.clgms.mapper.CollegeMapper;
import com.newtonn.clgms.model.College;
import com.newtonn.clgms.repo.CollegeRepo;
import com.newtonn.clgms.service.CollegeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CollegeServiceImpl implements CollegeService {

    private CollegeRepo collegeRepo;

    @Override
    public CollegeDto saveCollege(CollegeDto collegeDto) {
        College college = CollegeMapper.mapToCollege(collegeDto);
        College savedCollege = collegeRepo.save(college);

        return CollegeMapper.mapToCollegeDto(savedCollege);
    }
}
