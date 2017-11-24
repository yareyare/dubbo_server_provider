package com.juxinli.model;

import java.util.Date;

/**
 * Created by zhangyan
 * on 2017/8/20.
 * persistent object 基础类
 */
public class BasePo extends BaseObject {

    private Integer dataVersion;
    private Integer status;
    private Integer deleteFlag;
    private Date createDate;
    private Date updateDate;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion( Integer dataVersion ) {
        this.dataVersion = dataVersion;
    }


    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate( Date createDate ) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate( Date updateDate ) {
        this.updateDate = updateDate;
    }

}
