package com.karthik.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final String USERS_SEQUENCE = "SEQ_USERS";
    private static final long serialVersionUID = -7154849399198245482L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = USERS_SEQUENCE)
    @SequenceGenerator(name = USERS_SEQUENCE, sequenceName = USERS_SEQUENCE, allocationSize = 1)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATETIME", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime dateTime;

}
