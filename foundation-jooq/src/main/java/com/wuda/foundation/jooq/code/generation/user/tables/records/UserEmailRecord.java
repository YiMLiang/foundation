/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.user.tables.records;


import com.wuda.foundation.jooq.code.generation.user.tables.UserEmail;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * 用户的email
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEmailRecord extends UpdatableRecordImpl<UserEmailRecord> implements Record11<ULong, ULong, ULong, UByte, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -311940069;

    /**
     * Setter for <code>foundation_user.user_email.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_user.user_email.user_id</code>.
     */
    public void setUserId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.user_id</code>.
     */
    public ULong getUserId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_user.user_email.email_id</code>.
     */
    public void setEmailId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.email_id</code>.
     */
    public ULong getEmailId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>foundation_user.user_email.use</code>. 用途。比如用于登录
     */
    public void setUse(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.use</code>. 用途。比如用于登录
     */
    public UByte getUse() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>foundation_user.user_email.state</code>. 状态，每种用途的email状态可能不同，比如如果用于登录的email，状态可以是禁止登录状态
     */
    public void setState(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.state</code>. 状态，每种用途的email状态可能不同，比如如果用于登录的email，状态可以是禁止登录状态
     */
    public UByte getState() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>foundation_user.user_email.description</code>. 简单描述
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.description</code>. 简单描述
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>foundation_user.user_email.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_user.user_email.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_user.user_email.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>foundation_user.user_email.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>foundation_user.user_email.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>foundation_user.user_email.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<ULong, ULong, ULong, UByte, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<ULong, ULong, ULong, UByte, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return UserEmail.USER_EMAIL.ID;
    }

    @Override
    public Field<ULong> field2() {
        return UserEmail.USER_EMAIL.USER_ID;
    }

    @Override
    public Field<ULong> field3() {
        return UserEmail.USER_EMAIL.EMAIL_ID;
    }

    @Override
    public Field<UByte> field4() {
        return UserEmail.USER_EMAIL.USE;
    }

    @Override
    public Field<UByte> field5() {
        return UserEmail.USER_EMAIL.STATE;
    }

    @Override
    public Field<String> field6() {
        return UserEmail.USER_EMAIL.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return UserEmail.USER_EMAIL.CREATE_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return UserEmail.USER_EMAIL.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return UserEmail.USER_EMAIL.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field10() {
        return UserEmail.USER_EMAIL.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field11() {
        return UserEmail.USER_EMAIL.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public ULong component2() {
        return getUserId();
    }

    @Override
    public ULong component3() {
        return getEmailId();
    }

    @Override
    public UByte component4() {
        return getUse();
    }

    @Override
    public UByte component5() {
        return getState();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    @Override
    public ULong component8() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component9() {
        return getLastModifyTime();
    }

    @Override
    public ULong component10() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component11() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public ULong value2() {
        return getUserId();
    }

    @Override
    public ULong value3() {
        return getEmailId();
    }

    @Override
    public UByte value4() {
        return getUse();
    }

    @Override
    public UByte value5() {
        return getState();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    @Override
    public ULong value8() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value9() {
        return getLastModifyTime();
    }

    @Override
    public ULong value10() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value11() {
        return getIsDeleted();
    }

    @Override
    public UserEmailRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public UserEmailRecord value2(ULong value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserEmailRecord value3(ULong value) {
        setEmailId(value);
        return this;
    }

    @Override
    public UserEmailRecord value4(UByte value) {
        setUse(value);
        return this;
    }

    @Override
    public UserEmailRecord value5(UByte value) {
        setState(value);
        return this;
    }

    @Override
    public UserEmailRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public UserEmailRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserEmailRecord value8(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public UserEmailRecord value9(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public UserEmailRecord value10(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public UserEmailRecord value11(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public UserEmailRecord values(ULong value1, ULong value2, ULong value3, UByte value4, UByte value5, String value6, LocalDateTime value7, ULong value8, LocalDateTime value9, ULong value10, ULong value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserEmailRecord
     */
    public UserEmailRecord() {
        super(UserEmail.USER_EMAIL);
    }

    /**
     * Create a detached, initialised UserEmailRecord
     */
    public UserEmailRecord(ULong id, ULong userId, ULong emailId, UByte use, UByte state, String description, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(UserEmail.USER_EMAIL);

        set(0, id);
        set(1, userId);
        set(2, emailId);
        set(3, use);
        set(4, state);
        set(5, description);
        set(6, createTime);
        set(7, createUserId);
        set(8, lastModifyTime);
        set(9, lastModifyUserId);
        set(10, isDeleted);
    }
}