package com.portfolio.carrental.mappers;

import org.apache.ibatis.annotations.Param;

public interface TestMapper {

    Integer validateYesNo(@Param("yesNoId") String yesNoId);

}