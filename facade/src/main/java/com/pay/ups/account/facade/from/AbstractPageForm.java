package com.pay.ups.account.facade.from;

import com.baomidou.mybatisplus.plugins.Page;

public class AbstractPageForm<T extends AbstractPageForm<T>>{


    public  Page page;

    private int pageSize;

    private  int PageNumber;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public final T enablePaging() {
        page = new Page<T>(1,3);
        return (T) this;
    }
}
