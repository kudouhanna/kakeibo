package com.example.kakeibo.mapper;

import com.example.kakeibo.dto.Kakeibo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface KakeiboMapper {
    @Select("SELECT id, title, amount, type, category, date, memo FROM kakeibo ORDER BY date DESC")
    List<Kakeibo> findAll();
}