package com.tistory.jeongpro.book.domain.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class InnerObject {
	@NotNull
	@Max(value=10)
	@Min(value=0)
	private int count;
}
