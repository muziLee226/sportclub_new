package com.sportClub.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 破晓
 * @date: 2020/8/20 21:49
 * @description:
 */
    
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOntimeCourseList implements Serializable {
    /**
    * 用户Id
    */
    private Integer userId;

    /**
    * 在线课程Id
    */
    private Integer courseId;

    private static final long serialVersionUID = 1L;
}