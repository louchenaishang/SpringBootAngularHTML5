package com.mpalourdio.html5.api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;


/**
 * Created by louchen on 2017/6/28.
 */
@Data
public class User {

    @Id
    private String id;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String username;

    private Date createTime = new Date();

}

