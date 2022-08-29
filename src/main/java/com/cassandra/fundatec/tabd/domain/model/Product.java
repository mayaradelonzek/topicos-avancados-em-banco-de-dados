package com.cassandra.fundatec.tabd.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @PrimaryKey
    private int id;
    private String name;

}
