/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.notification.tables;


import com.wuda.foundation.jooq.code.generation.notification.FoundationNotification;
import com.wuda.foundation.jooq.code.generation.notification.Indexes;
import com.wuda.foundation.jooq.code.generation.notification.Keys;
import com.wuda.foundation.jooq.code.generation.notification.tables.records.NotificationCategoryRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationCategory extends TableImpl<NotificationCategoryRecord> {

    private static final long serialVersionUID = 1130256548;

    /**
     * The reference instance of <code>foundation_notification.notification_category</code>
     */
    public static final NotificationCategory NOTIFICATION_CATEGORY = new NotificationCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationCategoryRecord> getRecordType() {
        return NotificationCategoryRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_category.notification_category_id</code>. 与group_id相等，因为分类是一个组
     */
    public final TableField<NotificationCategoryRecord, ULong> NOTIFICATION_CATEGORY_ID = createField(DSL.name("notification_category_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "与group_id相等，因为分类是一个组");

    /**
     * The column <code>foundation_notification.notification_category.parent_notification_category_id</code>. 父级，一定和组的parent_group_id相等。
     */
    public final TableField<NotificationCategoryRecord, ULong> PARENT_NOTIFICATION_CATEGORY_ID = createField(DSL.name("parent_notification_category_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "父级，一定和组的parent_group_id相等。");

    /**
     * The column <code>foundation_notification.notification_category.root_notification_category_id</code>.
     */
    public final TableField<NotificationCategoryRecord, ULong> ROOT_NOTIFICATION_CATEGORY_ID = createField(DSL.name("root_notification_category_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_category.depth</code>.
     */
    public final TableField<NotificationCategoryRecord, UByte> DEPTH = createField(DSL.name("depth"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_category.name</code>. 名称
     */
    public final TableField<NotificationCategoryRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "名称");

    /**
     * The column <code>foundation_notification.notification_category.description</code>. 节点的描述
     */
    public final TableField<NotificationCategoryRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "节点的描述");

    /**
     * The column <code>foundation_notification.notification_category.create_time</code>. 描述
     */
    public final TableField<NotificationCategoryRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "描述");

    /**
     * The column <code>foundation_notification.notification_category.create_user_id</code>.
     */
    public final TableField<NotificationCategoryRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_category.last_modify_time</code>.
     */
    public final TableField<NotificationCategoryRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_category.last_modify_user_id</code>.
     */
    public final TableField<NotificationCategoryRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_category.is_deleted</code>.
     */
    public final TableField<NotificationCategoryRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_category</code> table reference
     */
    public NotificationCategory() {
        this(DSL.name("notification_category"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_category</code> table reference
     */
    public NotificationCategory(String alias) {
        this(DSL.name(alias), NOTIFICATION_CATEGORY);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_category</code> table reference
     */
    public NotificationCategory(Name alias) {
        this(alias, NOTIFICATION_CATEGORY);
    }

    private NotificationCategory(Name alias, Table<NotificationCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationCategory(Name alias, Table<NotificationCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("分类"), TableOptions.table());
    }

    public <O extends Record> NotificationCategory(Table<O> child, ForeignKey<O, NotificationCategoryRecord> key) {
        super(child, key, NOTIFICATION_CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NOTIFICATION_CATEGORY_IDX_PARENT_NOTIFICATION_CATEGORY_ID, Indexes.NOTIFICATION_CATEGORY_IDX_ROOT_NOTIFICATION_CATEGORY_ID);
    }

    @Override
    public Identity<NotificationCategoryRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_CATEGORY;
    }

    @Override
    public UniqueKey<NotificationCategoryRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_CATEGORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationCategoryRecord>>asList(Keys.KEY_NOTIFICATION_CATEGORY_PRIMARY);
    }

    @Override
    public NotificationCategory as(String alias) {
        return new NotificationCategory(DSL.name(alias), this);
    }

    @Override
    public NotificationCategory as(Name alias) {
        return new NotificationCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationCategory rename(String name) {
        return new NotificationCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationCategory rename(Name name) {
        return new NotificationCategory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<ULong, ULong, ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
