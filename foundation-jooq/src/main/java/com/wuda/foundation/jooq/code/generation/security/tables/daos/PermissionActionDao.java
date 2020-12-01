/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.security.tables.daos;


import com.wuda.foundation.jooq.code.generation.security.tables.PermissionAction;
import com.wuda.foundation.jooq.code.generation.security.tables.records.PermissionActionRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.List;


/**
 * permission允许的行为。参考: java.security.Permission#getActions。为什么要把作用对象和对该对象的action分开呢？因为对于同一个作用对象，可能有多个action，比如对于一个文件可以有读和写权限。action可以关联外部对象，具体的解释可以参考permission 
 * targe ,它们对于关联外部对象的定义是一样的。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionActionDao extends DAOImpl<PermissionActionRecord, com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction, ULong> {

    /**
     * Create a new PermissionActionDao without any configuration
     */
    public PermissionActionDao() {
        super(PermissionAction.PERMISSION_ACTION, com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction.class);
    }

    /**
     * Create a new PermissionActionDao with an attached configuration
     */
    public PermissionActionDao(Configuration configuration) {
        super(PermissionAction.PERMISSION_ACTION, com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction object) {
        return object.getPermissionActionId();
    }

    /**
     * Fetch records that have <code>permission_action_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfPermissionActionId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.PERMISSION_ACTION_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>permission_action_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByPermissionActionId(ULong... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.PERMISSION_ACTION_ID, values);
    }

    /**
     * Fetch a unique record that has <code>permission_action_id = value</code>
     */
    public com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction fetchOneByPermissionActionId(ULong value) {
        return fetchOne(PermissionAction.PERMISSION_ACTION.PERMISSION_ACTION_ID, value);
    }

    /**
     * Fetch records that have <code>permission_target_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfPermissionTargetId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.PERMISSION_TARGET_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>permission_target_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByPermissionTargetId(ULong... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.PERMISSION_TARGET_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByName(String... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.NAME, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByDescription(String... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>referenced_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfReferencedType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.REFERENCED_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>referenced_type IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByReferencedType(UByte... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.REFERENCED_TYPE, values);
    }

    /**
     * Fetch records that have <code>referenced_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfReferencedIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.REFERENCED_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>referenced_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByReferencedIdentifier(ULong... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.REFERENCED_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByCreateTime(LocalDateTime... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByCreateUserId(ULong... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByLastModifyUserId(ULong... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionAction.PERMISSION_ACTION.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionAction> fetchByIsDeleted(ULong... values) {
        return fetch(PermissionAction.PERMISSION_ACTION.IS_DELETED, values);
    }
}