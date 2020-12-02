/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.security.tables.daos;


import com.wuda.foundation.jooq.code.generation.security.tables.PermissionCategory;
import com.wuda.foundation.jooq.code.generation.security.tables.records.PermissionCategoryRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;


/**
 * permission分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionCategoryDao extends DAOImpl<PermissionCategoryRecord, com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory, ULong> {

    /**
     * Create a new PermissionCategoryDao without any configuration
     */
    public PermissionCategoryDao() {
        super(PermissionCategory.PERMISSION_CATEGORY, com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory.class);
    }

    /**
     * Create a new PermissionCategoryDao with an attached configuration
     */
    public PermissionCategoryDao(Configuration configuration) {
        super(PermissionCategory.PERMISSION_CATEGORY, com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory object) {
        return object.getPermissionCategoryId();
    }

    /**
     * Fetch records that have <code>permission_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfPermissionCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.PERMISSION_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>permission_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByPermissionCategoryId(ULong... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.PERMISSION_CATEGORY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>permission_category_id = value</code>
     */
    public com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory fetchOneByPermissionCategoryId(ULong value) {
        return fetchOne(PermissionCategory.PERMISSION_CATEGORY.PERMISSION_CATEGORY_ID, value);
    }

    /**
     * Fetch records that have <code>parent_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfParentId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.PARENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByParentId(ULong... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByName(String... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByDescription(String... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByCreateTime(LocalDateTime... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByCreateUserId(ULong... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByLastModifyUserId(ULong... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionCategory.PERMISSION_CATEGORY.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.security.tables.pojos.PermissionCategory> fetchByIsDeleted(ULong... values) {
        return fetch(PermissionCategory.PERMISSION_CATEGORY.IS_DELETED, values);
    }
}
