package com.example.kakeibo.service;

import com.example.kakeibo.dto.Kakeibo;
import com.example.kakeibo.repository.KakeiboRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KakeiboService {
    private final KakeiboRepository kakeiboRepository;

    public KakeiboService(KakeiboRepository kakeiboRepository) {
        this.kakeiboRepository = kakeiboRepository;
    }
    public List<Kakeibo> findAll() {
        return kakeiboRepository.findAll();
    }
}
