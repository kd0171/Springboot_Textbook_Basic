package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor	//コンストラクタを自動生成
@Getter	//ゲッターを自動生成
public class History {
	private int seq;
	private int youranswer;
	private String result;
}
