package com.twitter.api.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    private String nickname;
    private Long followers;
    private String idiom;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<PubModel> pub;
}
