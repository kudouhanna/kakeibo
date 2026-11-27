package com.example.kakeibo.repository;

import com.example.kakeibo.dto.Kakeibo;
import com.example.kakeibo.mapper.KakeiboMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KakeiboRepository {
    private final KakeiboMapper kakeiboMapper;

    public KakeiboRepository(KakeiboMapper kakeiboMapper) {
        this.kakeiboMapper = kakeiboMapper;
    }

    public List<Kakeibo> findAll() {
        return kakeiboMapper.findAll();
    }
}
