package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publicacao")
public class PubModel {
	
	@Id
	 private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

   @ManyToOne(cascade = 
	   {
          CascadeType.ALL
	   })
	
   @JoinColumn(name = "USER_ID")
   private UserModel user;

   @OneToMany(mappedBy = "pub", cascade = CascadeType.ALL)
    private Set<TagModel> tags;

   
   public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public Set<TagModel> getTags() {
		return tags;
	}

	public void setTags(Set<TagModel> tags) {
		this.tags = tags;
	}
}