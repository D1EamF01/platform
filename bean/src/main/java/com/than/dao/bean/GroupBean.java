package com.than.dao.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@Data
public class GroupBean {
    // 必须
    private String group_name;
    private String group_creator_account;
    private Integer group_sizes;
    private Integer group_max_sizes;

    private String group_headshot;
    private String group_background;
    private String group_signature;

    // 自动
    private String group_account;
    private Timestamp group_create_time;

    private String group_owner_account;
    private String group_region;
    private String group_tags;


    public GroupBean() {
        group_account = String.valueOf(System.nanoTime());

        group_create_time = new Timestamp(System.currentTimeMillis());
    }

    public GroupBean(String group_name, String group_creator_account, Integer group_sizes, Integer group_max_sizes) {
        this();
        this.group_name = group_name;
        this.group_creator_account = group_creator_account;
        this.group_sizes = group_sizes;
        this.group_max_sizes = group_max_sizes;
        this.group_owner_account = group_creator_account;
    }
}
