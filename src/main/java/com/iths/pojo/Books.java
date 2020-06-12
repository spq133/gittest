package com.iths.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
//实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books implements Serializable {

    private Integer bookId;
    private String bookName;
    private Integer bookCounts;
    private String detail;
}
