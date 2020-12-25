/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.commons.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * 可以代表站点的功能菜单中的一个具体功能，导航栏菜单（Navigation menu）中的一个具体项等等，这些item可能是按钮，链接等。参考Android的Menu，MenuItem，https://developer.android.com/reference/android/view/MenuItem。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MenuItemCore implements Serializable {

    private static final long serialVersionUID = 471660972;

    private ULong         menuItemCoreId;
    private ULong         menuItemId;
    private String        name;
    private String        description;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public MenuItemCore() {}

    public MenuItemCore(MenuItemCore value) {
        this.menuItemCoreId = value.menuItemCoreId;
        this.menuItemId = value.menuItemId;
        this.name = value.name;
        this.description = value.description;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public MenuItemCore(
        ULong         menuItemCoreId,
        ULong         menuItemId,
        String        name,
        String        description,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.menuItemCoreId = menuItemCoreId;
        this.menuItemId = menuItemId;
        this.name = name;
        this.description = description;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getMenuItemCoreId() {
        return this.menuItemCoreId;
    }

    public void setMenuItemCoreId(ULong menuItemCoreId) {
        this.menuItemCoreId = menuItemCoreId;
    }

    public ULong getMenuItemId() {
        return this.menuItemId;
    }

    public void setMenuItemId(ULong menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
        StringBuilder sb = new StringBuilder("MenuItemCore (");

        sb.append(menuItemCoreId);
        sb.append(", ").append(menuItemId);
        sb.append(", ").append(name);
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