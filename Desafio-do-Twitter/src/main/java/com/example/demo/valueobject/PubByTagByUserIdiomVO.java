package com.example.demo.valueobject;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class PubByTagByUserIdiomVO {
	
	private Long pubs;
    private String hashTag;
    private String idiom;
    
    public PubByTagByUserIdiomVO(Long pubs, String hashTag, String idiom) 
    {
        this.pubs = pubs;
        this.hashTag = String.format("#%s", hashTag);
        this.idiom = idiom;
    }
}
