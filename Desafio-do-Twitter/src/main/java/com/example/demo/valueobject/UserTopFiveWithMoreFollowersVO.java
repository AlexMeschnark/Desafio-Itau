package com.example.demo.valueobject;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class UserTopFiveWithMoreFollowersVO {

	private Long id;
    private String userName;
    private Long followers;
}
