package com.spring.beans;

import org.springframework.stereotype.Component;

import com.spring.inteface.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is your lucky day";
	}

}
