package com.example.demo.model;

import lombok.*;

@Builder @Data
public class SalaryModel {
	@NonNull @Builder.Default private int id = 5; // 널 값 허용하지 않음, 디폴트 값을 설정해줌
	@NonNull private String name;
	@NonNull private String email;	
}