package com.bitcamp.sc.order.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
	private int idx;
	private Timestamp date;
	private String category;
	private int price;
	private int tourIdx;
	private int tourPeople;
	private int memberIdx;
	private Integer addressIdx;

	public OrderInfo(String category, int price, int tourIdx, int tourPeople, int memberIdx, Integer addressIdx) {
		this.category = category;
		this.price = price;
		this.tourIdx = tourIdx;
		this.tourPeople = tourPeople;
		this.memberIdx = memberIdx;
		this.addressIdx = addressIdx;
	}
}
