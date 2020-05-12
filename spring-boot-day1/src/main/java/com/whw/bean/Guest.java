package com.whw.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor@NoArgsConstructor
public class Guest {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String sore;
}
