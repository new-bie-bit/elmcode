package com.neusoft.elmcloud.commonapi.entity;

import java.io.Serializable;

public class BasePageBean implements Serializable {

    private static final long serialVersionUID = 8213386075502439448L;
    protected Integer pageIndex;
    protected Integer pageSize;

    private int defaultSize = 10;
    private int defaultIndex = 1;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        if (pageIndex == null || pageIndex <= 0) {
            pageIndex = defaultIndex;
        }
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize == null || pageSize <= 0) {
            pageSize = defaultSize;
        }
        this.pageSize = pageSize;
    }
}
