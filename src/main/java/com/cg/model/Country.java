package com.cg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @OneToMany(targetEntity = User.class, fetch = FetchType.EAGER,mappedBy = "country")
    private List<User> userList;

    @OneToMany(targetEntity = City.class, fetch = FetchType.EAGER)
    private List<City> cityList;
}
