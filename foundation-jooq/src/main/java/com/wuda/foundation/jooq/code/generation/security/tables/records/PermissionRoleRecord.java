/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.security.tables.records;


import com.wuda.foundation.jooq.code.generation.security.tables.PermissionRole;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 角色
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionRoleRecord extends UpdatableRecordImpl<PermissionRoleRecord> implements Record9<ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1104503465;

    /**
     * Setter for <code>foundation_security.permission_role.permission_role_id</code>.
     */
    public void setPermissionRoleId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.permission_role_id</code>.
     */
    public ULong getPermissionRoleId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_security.permission_role.type</code>. 角色的类型，比如某一类型的角色只用于用户在组中的角色；某一类型的角色只用于菜单访问控制
     */
    public void setType(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.type</code>. 角色的类型，比如某一类型的角色只用于用户在组中的角色；某一类型的角色只用于菜单访问控制
     */
    public UByte getType() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>foundation_security.permission_role.name</code>. 名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.name</code>. 名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_security.permission_role.description</code>. 描述
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.description</code>. 描述
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>foundation_security.permission_role.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>foundation_security.permission_role.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>foundation_security.permission_role.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_security.permission_role.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_security.permission_role.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_security.permission_role.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return PermissionRole.PERMISSION_ROLE.PERMISSION_ROLE_ID;
    }

    @Override
    public Field<UByte> field2() {
        return PermissionRole.PERMISSION_ROLE.TYPE;
    }

    @Override
    public Field<String> field3() {
        return PermissionRole.PERMISSION_ROLE.NAME;
    }

    @Override
    public Field<String> field4() {
        return PermissionRole.PERMISSION_ROLE.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return PermissionRole.PERMISSION_ROLE.CREATE_TIME;
    }

    @Override
    public Field<ULong> field6() {
        return PermissionRole.PERMISSION_ROLE.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return PermissionRole.PERMISSION_ROLE.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return PermissionRole.PERMISSION_ROLE.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return PermissionRole.PERMISSION_ROLE.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getPermissionRoleId();
    }

    @Override
    public UByte component2() {
        return getType();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public ULong component6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifyTime();
    }

    @Override
    public ULong component8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getPermissionRoleId();
    }

    @Override
    public UByte value2() {
        return getType();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public ULong value6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifyTime();
    }

    @Override
    public ULong value8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public PermissionRoleRecord value1(ULong value) {
        setPermissionRoleId(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value2(UByte value) {
        setType(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value6(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value7(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value8(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public PermissionRoleRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public PermissionRoleRecord values(ULong value1, UByte value2, String value3, String value4, LocalDateTime value5, ULong value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PermissionRoleRecord
     */
    public PermissionRoleRecord() {
        super(PermissionRole.PERMISSION_ROLE);
    }

    /**
     * Create a detached, initialised PermissionRoleRecord
     */
    public PermissionRoleRecord(ULong permissionRoleId, UByte type, String name, String description, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(PermissionRole.PERMISSION_ROLE);

        set(0, permissionRoleId);
        set(1, type);
        set(2, name);
        set(3, description);
        set(4, createTime);
        set(5, createUserId);
        set(6, lastModifyTime);
        set(7, lastModifyUserId);
        set(8, isDeleted);
    }
}
