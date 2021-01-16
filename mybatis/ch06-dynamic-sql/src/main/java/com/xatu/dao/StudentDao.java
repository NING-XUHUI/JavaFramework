package com.xatu.dao;

import com.xatu.domain.MyStudent;
import com.xatu.domain.Student;
import com.xatu.vo.QueryParam;
import com.xatu.vo.ViewStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ningxuhui
 */
public interface StudentDao {
    List<Student> selectStudentIf(Student student);
}
