/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.commons.tables.records;


import com.wuda.foundation.jooq.code.generation.commons.tables.MenuItemBelongsToCategory;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * 表示menu item所属的分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MenuItemBelongsToCategoryRecord extends UpdatableRecordImpl<MenuItemBelongsToCategoryRecord> implements Record8<ULong, ULong, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -1623453991;

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.menu_item_id</code>.
     */
    public void setMenuItemId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.menu_item_id</code>.
     */
    public ULong getMenuItemId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.menu_item_category_id</code>. 在数据库设计方面至少一个menu item可以属于多个category，这样可以为以后留扩展空间，比如即使同一个站点，可以制作多个menu；或者比如拥有多个店铺的电商平台，每个店铺有自己的menu，等等这样的需求。
     */
    public void setMenuItemCategoryId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.menu_item_category_id</code>. 在数据库设计方面至少一个menu item可以属于多个category，这样可以为以后留扩展空间，比如即使同一个站点，可以制作多个menu；或者比如拥有多个店铺的电商平台，每个店铺有自己的menu，等等这样的需求。
     */
    public ULong getMenuItemCategoryId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>foundation_commons.menu_item_belongs_to_category.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item_belongs_to_category.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, ULong, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.ID;
    }

    @Override
    public Field<ULong> field2() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.MENU_ITEM_ID;
    }

    @Override
    public Field<ULong> field3() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.MENU_ITEM_CATEGORY_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.CREATE_TIME;
    }

    @Override
    public Field<ULong> field5() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field7() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field8() {
        return MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public ULong component2() {
        return getMenuItemId();
    }

    @Override
    public ULong component3() {
        return getMenuItemCategoryId();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public ULong component5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component6() {
        return getLastModifyTime();
    }

    @Override
    public ULong component7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component8() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public ULong value2() {
        return getMenuItemId();
    }

    @Override
    public ULong value3() {
        return getMenuItemCategoryId();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public ULong value5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value6() {
        return getLastModifyTime();
    }

    @Override
    public ULong value7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value8() {
        return getIsDeleted();
    }

    @Override
    public MenuItemBelongsToCategoryRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value2(ULong value) {
        setMenuItemId(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value3(ULong value) {
        setMenuItemCategoryId(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value5(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value6(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value7(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord value8(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public MenuItemBelongsToCategoryRecord values(ULong value1, ULong value2, ULong value3, LocalDateTime value4, ULong value5, LocalDateTime value6, ULong value7, ULong value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MenuItemBelongsToCategoryRecord
     */
    public MenuItemBelongsToCategoryRecord() {
        super(MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY);
    }

    /**
     * Create a detached, initialised MenuItemBelongsToCategoryRecord
     */
    public MenuItemBelongsToCategoryRecord(ULong id, ULong menuItemId, ULong menuItemCategoryId, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY);

        set(0, id);
        set(1, menuItemId);
        set(2, menuItemCategoryId);
        set(3, createTime);
        set(4, createUserId);
        set(5, lastModifyTime);
        set(6, lastModifyUserId);
        set(7, isDeleted);
    }
}