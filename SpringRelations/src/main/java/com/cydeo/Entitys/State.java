package com.cydeo.Entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class State extends BaseEntity {

    String stateCode;
    String stateName;
    @OneToMany(mappedBy = "state")
    private List<com.cydeo.Entitys.Address> address;
}
