package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import java.util.Set;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class UserModel {

	@Id
	private Long id;
    private String screenName;
    private Long followers;
    private String idiom;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<PubModel> pub;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Long getFollowers() {
		return followers;
	}

	public void setFollowers(Long followers) {
		this.followers = followers;
	}

	public String getIdiom() {
		return idiom;
	}

	public void setIdiom(String idiom) {
		this.idiom = idiom;
	}

	public Set<PubModel> getPub() {
		return pub;
	}

	public void setPub(Set<PubModel> pub) {
		this.pub = pub;
	}
    
    
}
