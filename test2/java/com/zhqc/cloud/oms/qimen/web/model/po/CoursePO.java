package com.zhqc.cloud.oms.qimen.web.model.po;

import com.zhqc.framerwork.common.model.po.BasePO;

/**
 * 
 * @author liaohuanghe 2022/04/06
 * @version 1.2.9
 */
public class CoursePO extends BasePO {
    /**
     * Id
     */
    private Integer id;

    /**
     * Stuid
     */
    private Integer stuid;

    /**
     * Cname
     */
    private String cname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}