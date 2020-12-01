/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables;


import com.wuda.foundation.core.commons.impl.jooq.generation.FoundationCommons;
import com.wuda.foundation.core.commons.impl.jooq.generation.Keys;
import com.wuda.foundation.core.commons.impl.jooq.generation.tables.records.EmailRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * email信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Email extends TableImpl<EmailRecord> {

    private static final long serialVersionUID = 148305052;

    /**
     * The reference instance of <code>foundation_commons.email</code>
     */
    public static final Email EMAIL = new Email();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailRecord> getRecordType() {
        return EmailRecord.class;
    }

    /**
     * The column <code>foundation_commons.email.email_id</code>.
     */
    public final TableField<EmailRecord, ULong> EMAIL_ID = createField(DSL.name("email_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.email.address</code>. email address
     */
    public final TableField<EmailRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "email address");

    /**
     * The column <code>foundation_commons.email.state</code>. 邮箱状态。1比如：验证不通过，验证通过，未验证
     */
    public final TableField<EmailRecord, UByte> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "邮箱状态。1比如：验证不通过，验证通过，未验证");

    /**
     * The column <code>foundation_commons.email.create_time</code>.
     */
    public final TableField<EmailRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.email.create_user_id</code>.
     */
    public final TableField<EmailRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.email.last_modify_time</code>.
     */
    public final TableField<EmailRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.email.last_modify_user_id</code>.
     */
    public final TableField<EmailRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.email.is_deleted</code>.
     */
    public final TableField<EmailRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.email</code> table reference
     */
    public Email() {
        this(DSL.name("email"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.email</code> table reference
     */
    public Email(String alias) {
        this(DSL.name(alias), EMAIL);
    }

    /**
     * Create an aliased <code>foundation_commons.email</code> table reference
     */
    public Email(Name alias) {
        this(alias, EMAIL);
    }

    private Email(Name alias, Table<EmailRecord> aliased) {
        this(alias, aliased, null);
    }

    private Email(Name alias, Table<EmailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("email信息"), TableOptions.table());
    }

    public <O extends Record> Email(Table<O> child, ForeignKey<O, EmailRecord> key) {
        super(child, key, EMAIL);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public Identity<EmailRecord, ULong> getIdentity() {
        return Keys.IDENTITY_EMAIL;
    }

    @Override
    public UniqueKey<EmailRecord> getPrimaryKey() {
        return Keys.KEY_EMAIL_PRIMARY;
    }

    @Override
    public List<UniqueKey<EmailRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailRecord>>asList(Keys.KEY_EMAIL_PRIMARY, Keys.KEY_EMAIL_IDX_EMAIL_UNIQUE);
    }

    @Override
    public Email as(String alias) {
        return new Email(DSL.name(alias), this);
    }

    @Override
    public Email as(Name alias) {
        return new Email(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Email rename(String name) {
        return new Email(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Email rename(Name name) {
        return new Email(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
