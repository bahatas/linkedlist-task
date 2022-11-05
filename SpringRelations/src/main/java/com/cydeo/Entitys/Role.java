package main.java.com.cydeo.Entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Role extends com.cydeo.entity.BaseEntity {

    String name;


}
