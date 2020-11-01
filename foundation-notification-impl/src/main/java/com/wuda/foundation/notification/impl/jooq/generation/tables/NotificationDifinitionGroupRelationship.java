/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables;


import com.wuda.foundation.notification.impl.jooq.generation.FoundationNotification;
import com.wuda.foundation.notification.impl.jooq.generation.Indexes;
import com.wuda.foundation.notification.impl.jooq.generation.Keys;
import com.wuda.foundation.notification.impl.jooq.generation.tables.records.NotificationDifinitionGroupRelationshipRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 通知定义所属的组
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDifinitionGroupRelationship extends TableImpl<NotificationDifinitionGroupRelationshipRecord> {

    private static final long serialVersionUID = 923699409;

    /**
     * The reference instance of <code>foundation_notification.notification_difinition_group_relationship</code>
     */
    public static final NotificationDifinitionGroupRelationship NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP = new NotificationDifinitionGroupRelationship();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationDifinitionGroupRelationshipRecord> getRecordType() {
        return NotificationDifinitionGroupRelationshipRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.id</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.notification_difinition_id</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, ULong> NOTIFICATION_DIFINITION_ID = createField(DSL.name("notification_difinition_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.group_id</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, ULong> GROUP_ID = createField(DSL.name("group_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.create_time</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.create_user_id</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.last_modify_time</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.last_modify_user_id</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_difinition_group_relationship.is_deleted</code>.
     */
    public final TableField<NotificationDifinitionGroupRelationshipRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_difinition_group_relationship</code> table reference
     */
    public NotificationDifinitionGroupRelationship() {
        this(DSL.name("notification_difinition_group_relationship"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_difinition_group_relationship</code> table reference
     */
    public NotificationDifinitionGroupRelationship(String alias) {
        this(DSL.name(alias), NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_difinition_group_relationship</code> table reference
     */
    public NotificationDifinitionGroupRelationship(Name alias) {
        this(alias, NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP);
    }

    private NotificationDifinitionGroupRelationship(Name alias, Table<NotificationDifinitionGroupRelationshipRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationDifinitionGroupRelationship(Name alias, Table<NotificationDifinitionGroupRelationshipRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("通知定义所属的组"), TableOptions.table());
    }

    public <O extends Record> NotificationDifinitionGroupRelationship(Table<O> child, ForeignKey<O, NotificationDifinitionGroupRelationshipRecord> key) {
        super(child, key, NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP_IDX_GROUP_ID, Indexes.NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP_IDX_NOTIFICATION_DEFINITION_ID);
    }

    @Override
    public Identity<NotificationDifinitionGroupRelationshipRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP;
    }

    @Override
    public UniqueKey<NotificationDifinitionGroupRelationshipRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationDifinitionGroupRelationshipRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationDifinitionGroupRelationshipRecord>>asList(Keys.KEY_NOTIFICATION_DIFINITION_GROUP_RELATIONSHIP_PRIMARY);
    }

    @Override
    public NotificationDifinitionGroupRelationship as(String alias) {
        return new NotificationDifinitionGroupRelationship(DSL.name(alias), this);
    }

    @Override
    public NotificationDifinitionGroupRelationship as(Name alias) {
        return new NotificationDifinitionGroupRelationship(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDifinitionGroupRelationship rename(String name) {
        return new NotificationDifinitionGroupRelationship(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDifinitionGroupRelationship rename(Name name) {
        return new NotificationDifinitionGroupRelationship(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}