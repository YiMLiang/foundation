/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables;


import com.wuda.foundation.core.commons.impl.jooq.generation.FoundationCommons;
import com.wuda.foundation.core.commons.impl.jooq.generation.Keys;
import com.wuda.foundation.core.commons.impl.jooq.generation.tables.records.PropertyKeyRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
 * 属性的key
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyKey extends TableImpl<PropertyKeyRecord> {

    private static final long serialVersionUID = -454252699;

    /**
     * The reference instance of <code>foundation_commons.property_key</code>
     */
    public static final PropertyKey PROPERTY_KEY = new PropertyKey();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PropertyKeyRecord> getRecordType() {
        return PropertyKeyRecord.class;
    }

    /**
     * The column <code>foundation_commons.property_key.property_key_id</code>.
     */
    public final TableField<PropertyKeyRecord, ULong> PROPERTY_KEY_ID = createField(DSL.name("property_key_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.property_key.key</code>. 属性名
     */
    public final TableField<PropertyKeyRecord, String> KEY = createField(DSL.name("key"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "属性名");

    /**
     * The column <code>foundation_commons.property_key.type</code>. 属性的类型，比如最常用的就是“字面量”类型；比如该属性表示图片，属性值保存图片的链接；比如该属性表示颜色，因为在一些应用中，可以使用调色盘选取颜色，或者在显示时，可以显示颜色，而不是白色这样的纯文本
     */
    public final TableField<PropertyKeyRecord, UByte> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "属性的类型，比如最常用的就是“字面量”类型；比如该属性表示图片，属性值保存图片的链接；比如该属性表示颜色，因为在一些应用中，可以使用调色盘选取颜色，或者在显示时，可以显示颜色，而不是白色这样的纯文本");

    /**
     * The column <code>foundation_commons.property_key.owner_type</code>. 该属性的owner的类型
     */
    public final TableField<PropertyKeyRecord, UByte> OWNER_TYPE = createField(DSL.name("owner_type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "该属性的owner的类型");

    /**
     * The column <code>foundation_commons.property_key.owner_identifier</code>. 该属性的owner的id
     */
    public final TableField<PropertyKeyRecord, ULong> OWNER_IDENTIFIER = createField(DSL.name("owner_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "该属性的owner的id");

    /**
     * The column <code>foundation_commons.property_key.create_time</code>.
     */
    public final TableField<PropertyKeyRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.property_key.create_user_id</code>.
     */
    public final TableField<PropertyKeyRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.property_key.last_modify_time</code>.
     */
    public final TableField<PropertyKeyRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.property_key.last_modify_user_id</code>.
     */
    public final TableField<PropertyKeyRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.property_key.is_deleted</code>.
     */
    public final TableField<PropertyKeyRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.property_key</code> table reference
     */
    public PropertyKey() {
        this(DSL.name("property_key"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.property_key</code> table reference
     */
    public PropertyKey(String alias) {
        this(DSL.name(alias), PROPERTY_KEY);
    }

    /**
     * Create an aliased <code>foundation_commons.property_key</code> table reference
     */
    public PropertyKey(Name alias) {
        this(alias, PROPERTY_KEY);
    }

    private PropertyKey(Name alias, Table<PropertyKeyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PropertyKey(Name alias, Table<PropertyKeyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("属性的key"), TableOptions.table());
    }

    public <O extends Record> PropertyKey(Table<O> child, ForeignKey<O, PropertyKeyRecord> key) {
        super(child, key, PROPERTY_KEY);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public Identity<PropertyKeyRecord, ULong> getIdentity() {
        return Keys.IDENTITY_PROPERTY_KEY;
    }

    @Override
    public UniqueKey<PropertyKeyRecord> getPrimaryKey() {
        return Keys.KEY_PROPERTY_KEY_PRIMARY;
    }

    @Override
    public List<UniqueKey<PropertyKeyRecord>> getKeys() {
        return Arrays.<UniqueKey<PropertyKeyRecord>>asList(Keys.KEY_PROPERTY_KEY_PRIMARY, Keys.KEY_PROPERTY_KEY_IDX_UNIQUE);
    }

    @Override
    public PropertyKey as(String alias) {
        return new PropertyKey(DSL.name(alias), this);
    }

    @Override
    public PropertyKey as(Name alias) {
        return new PropertyKey(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PropertyKey rename(String name) {
        return new PropertyKey(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PropertyKey rename(Name name) {
        return new PropertyKey(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, String, UByte, UByte, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
