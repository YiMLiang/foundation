/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.security.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * permission作用的对象，分为两类，1，关联外部对象，使用type字段表明外部对象的类型，referenced_id表明外部对象的唯一标记，比如在web系统中，已经拥有了菜单表，如果要对菜单权限控制，使用referenced_id关联菜单表的主键ID，就可以将permission与菜单数据建立联系，而不需要把菜单相关的逻辑引入到权限体系中；2，不关联外部对象，当前表中的信息就已经描述了作用对象的信息。对于permission体系来说，permission 
 * target是主体（一等公民），permiss
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionTarget implements Serializable {

    private static final long serialVersionUID = -686582617;

    private ULong         permissionTargetId;
    private ULong         permissionCategoryId;
    private String        name;
    private UByte         type;
    private UByte         referencedType;
    private ULong         referencedIdentifier;
    private String        description;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public PermissionTarget() {}

    public PermissionTarget(PermissionTarget value) {
        this.permissionTargetId = value.permissionTargetId;
        this.permissionCategoryId = value.permissionCategoryId;
        this.name = value.name;
        this.type = value.type;
        this.referencedType = value.referencedType;
        this.referencedIdentifier = value.referencedIdentifier;
        this.description = value.description;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public PermissionTarget(
        ULong         permissionTargetId,
        ULong         permissionCategoryId,
        String        name,
        UByte         type,
        UByte         referencedType,
        ULong         referencedIdentifier,
        String        description,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.permissionTargetId = permissionTargetId;
        this.permissionCategoryId = permissionCategoryId;
        this.name = name;
        this.type = type;
        this.referencedType = referencedType;
        this.referencedIdentifier = referencedIdentifier;
        this.description = description;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getPermissionTargetId() {
        return this.permissionTargetId;
    }

    public void setPermissionTargetId(ULong permissionTargetId) {
        this.permissionTargetId = permissionTargetId;
    }

    public ULong getPermissionCategoryId() {
        return this.permissionCategoryId;
    }

    public void setPermissionCategoryId(ULong permissionCategoryId) {
        this.permissionCategoryId = permissionCategoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UByte getType() {
        return this.type;
    }

    public void setType(UByte type) {
        this.type = type;
    }

    public UByte getReferencedType() {
        return this.referencedType;
    }

    public void setReferencedType(UByte referencedType) {
        this.referencedType = referencedType;
    }

    public ULong getReferencedIdentifier() {
        return this.referencedIdentifier;
    }

    public void setReferencedIdentifier(ULong referencedIdentifier) {
        this.referencedIdentifier = referencedIdentifier;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        StringBuilder sb = new StringBuilder("PermissionTarget (");

        sb.append(permissionTargetId);
        sb.append(", ").append(permissionCategoryId);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(referencedType);
        sb.append(", ").append(referencedIdentifier);
        sb.append(", ").append(description);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
