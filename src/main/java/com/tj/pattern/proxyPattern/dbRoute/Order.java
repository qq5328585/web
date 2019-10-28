package com.tj.pattern.proxyPattern.dbRoute;

import java.util.Date;

/**
 * 2019/10/27
 * author:ljh
 */
public class Order {

    private Long id;

    private Date createDate;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
