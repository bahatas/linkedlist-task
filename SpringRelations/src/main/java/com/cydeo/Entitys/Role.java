package com.cydeo.Entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Role extends BaseEntity {

    private String name;
    @OneToMany(mappedBy = "role")
    private List<User> userList;


}
