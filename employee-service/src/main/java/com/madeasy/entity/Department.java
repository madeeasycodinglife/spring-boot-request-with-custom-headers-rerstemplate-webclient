package com.madeasy.entity;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Department {
    private Integer id;
    private String name;
    private String type;
}
