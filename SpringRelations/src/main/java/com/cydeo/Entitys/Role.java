package com.cydeo.Entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Role extends BaseEntity {

    private String name;
    @OneToMany(mappedBy = "role")
    private User user;


}
