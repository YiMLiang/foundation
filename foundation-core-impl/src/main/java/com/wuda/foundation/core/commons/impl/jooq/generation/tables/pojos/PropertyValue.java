/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos;


import org.jooq.types.ULong;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 属性的值
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyValue implements Serializable {

    private static final long serialVersionUID = -350531652;

    private ULong         propertyValueId;
    private ULong         propertyKeyId;
    private String        value;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public PropertyValue() {}

    public PropertyValue(PropertyValue value) {
        this.propertyValueId = value.propertyValueId;
        this.propertyKeyId = value.propertyKeyId;
        this.value = value.value;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public PropertyValue(
        ULong         propertyValueId,
        ULong         propertyKeyId,
        String        value,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.propertyValueId = propertyValueId;
        this.propertyKeyId = propertyKeyId;
        this.value = value;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getPropertyValueId() {
        return this.propertyValueId;
    }

    public void setPropertyValueId(ULong propertyValueId) {
        this.propertyValueId = propertyValueId;
    }

    public ULong getPropertyKeyId() {
        return this.propertyKeyId;
    }

    public void setPropertyKeyId(ULong propertyKeyId) {
        this.propertyKeyId = propertyKeyId;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyValue (");

        sb.append(propertyValueId);
        sb.append(", ").append(propertyKeyId);
        sb.append(", ").append(value);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
