package com.example.kakeibo.controller;

import com.example.kakeibo.dto.Kakeibo;
import com.example.kakeibo.service.KakeiboService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kakeibo")
public class KakeiboController {
    private final KakeiboService kakeiboService;

    public KakeiboController(KakeiboService kakeiboService) {
        this.kakeiboService = kakeiboService;
    }

    @GetMapping
    public ResponseEntity<List<Kakeibo>> findAllKakeibo(){
        List<Kakeibo> kakeibo = kakeiboService.findAll();

        return new ResponseEntity<>(kakeibo, HttpStatus.OK);
    }
}
