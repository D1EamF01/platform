package com.than.dao;

import com.than.controller.bean.PersonalPostBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Than
 * @package: com.than.dao
 * @className: PostDao
 * @description: 操作帖子
 * @date: 2023/10/15 20:52
 */

@Mapper
public interface PostDao {
    // 插入帖子
    @Insert("INSERT INTO posts_tbl (title, content, createTime, updateTime, authorId) " +
            "VALUES (#{title}, #{content}, #{createTime}, #{updateTime}, #{authorId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    boolean insertPersonalPostBean(PersonalPostBean personalPostBean);

    // 根据ID查询帖子
    @Select("SELECT 1 FROM posts_tbl WHERE id = #{id}")
    PersonalPostBean selectPersonalPostBeanById(Long id);

    // 查询所有帖子
    @Select("SELECT * FROM posts_tbl")
    List<PersonalPostBean> selectAllPostBeans();
    // 查询个人用户所有帖子
    @Select("SELECT * FROM posts_tbl where authorId = #{authorId}")
    List<PersonalPostBean> selectAllPersonalPostBeansByAuthorId(Long authorId);

    // 更新帖子
    @Update("UPDATE posts_tbl SET title = #{title}, content = #{content}, " +
            "createTime = #{createTime}, updateTime = #{updateTime}, authorId = #{authorId} " +
            "WHERE id = #{id}")
    boolean updatePersonalPostBean(PersonalPostBean personalPostBean);

    // 根据ID删除帖子
    @Delete("DELETE FROM posts_tbl WHERE id = #{id}")
    boolean deletePersonalPostBeanById(Long id);
}

