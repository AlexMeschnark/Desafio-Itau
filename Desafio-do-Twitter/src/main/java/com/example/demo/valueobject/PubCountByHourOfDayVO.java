package com.example.demo.valueobject;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class PubCountByHourOfDayVO {

	private Long amount;
    private String date;

    public PubCountByHourOfDayVO(Long amount, String dataFormated) {
        this.amount = amount;
        this.date = dataFormated;
    }

    public PubCountByHourOfDayVO(Long amount, Integer year, Integer month, Integer day, Integer hour) {
        this.amount = amount;
        this.date = String.format("%sh %d/%d/%d", hour, day, month = month, year, hour);
    }
}
