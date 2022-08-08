package com.example.xumama.entity;

import java.util.Date;
import lombok.Data;

/**
 *  Dingdan
 *
 *  @author zhangshun
 *  @date 2022/8/8
 */
@Data
public class Dingdan {
    private Integer id;

    private Date dingdanDate;

    private String dingdanZhucai;

    private String dingdanQingcai;

    private String dingdanPeicai;

    private String dingdanTangshui;

    private String dingdanUser;

    private Integer dingdanJiage;
}