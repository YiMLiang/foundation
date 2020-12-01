/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables.records;


import com.wuda.foundation.core.commons.impl.jooq.generation.tables.AdministrativeUnit;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

import java.time.LocalDateTime;


/**
 * 行政单元，行政区域划分。也就是省市区等数据，不按省市区建表，因为不一定是按那样划分，比如北京，深圳，但是他们有一个共同特点，那就是有上下级关系，因此用ID/PID的方式组织。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdministrativeUnitRecord extends UpdatableRecordImpl<AdministrativeUnitRecord> implements Record12<UShort, UShort, String, String, String, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -1253413490;

    /**
     * Setter for <code>foundation_commons.administrative_unit.administrative_unit_id</code>. 必须显示指定，如果用自增，会导致parent_id找不到正确的父级
     */
    public void setAdministrativeUnitId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.administrative_unit_id</code>. 必须显示指定，如果用自增，会导致parent_id找不到正确的父级
     */
    public UShort getAdministrativeUnitId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.parent_id</code>.
     */
    public void setParentId(UShort value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.parent_id</code>.
     */
    public UShort getParentId() {
        return (UShort) get(1);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.full_name</code>. 全名，比如：湖南省
     */
    public void setFullName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.full_name</code>. 全名，比如：湖南省
     */
    public String getFullName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.short_name</code>. 简写，比如：湖南省的简写是湖南
     */
    public void setShortName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.short_name</code>. 简写，比如：湖南省的简写是湖南
     */
    public String getShortName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.alias</code>. 比如：湖南的alias是湘，广州的alias是羊城
     */
    public void setAlias(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.alias</code>. 比如：湖南的alias是湘，广州的alias是羊城
     */
    public String getAlias() {
        return (String) get(4);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.level</code>. 级别，比如湖南省处于第一级，北京市也是第一级
     */
    public void setLevel(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.level</code>. 级别，比如湖南省处于第一级，北京市也是第一级
     */
    public UByte getLevel() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.level_name</code>. 比如湖南省，level_name=省，北京市的level_name=市
     */
    public void setLevelName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.level_name</code>. 比如湖南省，level_name=省，北京市的level_name=市
     */
    public String getLevelName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>foundation_commons.administrative_unit.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>foundation_commons.administrative_unit.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UShort, UShort, String, String, String, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UShort, UShort, String, String, String, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UShort> field1() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.ADMINISTRATIVE_UNIT_ID;
    }

    @Override
    public Field<UShort> field2() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.PARENT_ID;
    }

    @Override
    public Field<String> field3() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.FULL_NAME;
    }

    @Override
    public Field<String> field4() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.SHORT_NAME;
    }

    @Override
    public Field<String> field5() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.ALIAS;
    }

    @Override
    public Field<UByte> field6() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.LEVEL;
    }

    @Override
    public Field<String> field7() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.LEVEL_NAME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.CREATE_TIME;
    }

    @Override
    public Field<ULong> field9() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field11() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field12() {
        return AdministrativeUnit.ADMINISTRATIVE_UNIT.IS_DELETED;
    }

    @Override
    public UShort component1() {
        return getAdministrativeUnitId();
    }

    @Override
    public UShort component2() {
        return getParentId();
    }

    @Override
    public String component3() {
        return getFullName();
    }

    @Override
    public String component4() {
        return getShortName();
    }

    @Override
    public String component5() {
        return getAlias();
    }

    @Override
    public UByte component6() {
        return getLevel();
    }

    @Override
    public String component7() {
        return getLevelName();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public ULong component9() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component10() {
        return getLastModifyTime();
    }

    @Override
    public ULong component11() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component12() {
        return getIsDeleted();
    }

    @Override
    public UShort value1() {
        return getAdministrativeUnitId();
    }

    @Override
    public UShort value2() {
        return getParentId();
    }

    @Override
    public String value3() {
        return getFullName();
    }

    @Override
    public String value4() {
        return getShortName();
    }

    @Override
    public String value5() {
        return getAlias();
    }

    @Override
    public UByte value6() {
        return getLevel();
    }

    @Override
    public String value7() {
        return getLevelName();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public ULong value9() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value10() {
        return getLastModifyTime();
    }

    @Override
    public ULong value11() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value12() {
        return getIsDeleted();
    }

    @Override
    public AdministrativeUnitRecord value1(UShort value) {
        setAdministrativeUnitId(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value2(UShort value) {
        setParentId(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value3(String value) {
        setFullName(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value4(String value) {
        setShortName(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value5(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value6(UByte value) {
        setLevel(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value7(String value) {
        setLevelName(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value9(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value10(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value11(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord value12(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public AdministrativeUnitRecord values(UShort value1, UShort value2, String value3, String value4, String value5, UByte value6, String value7, LocalDateTime value8, ULong value9, LocalDateTime value10, ULong value11, ULong value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdministrativeUnitRecord
     */
    public AdministrativeUnitRecord() {
        super(AdministrativeUnit.ADMINISTRATIVE_UNIT);
    }

    /**
     * Create a detached, initialised AdministrativeUnitRecord
     */
    public AdministrativeUnitRecord(UShort administrativeUnitId, UShort parentId, String fullName, String shortName, String alias, UByte level, String levelName, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(AdministrativeUnit.ADMINISTRATIVE_UNIT);

        set(0, administrativeUnitId);
        set(1, parentId);
        set(2, fullName);
        set(3, shortName);
        set(4, alias);
        set(5, level);
        set(6, levelName);
        set(7, createTime);
        set(8, createUserId);
        set(9, lastModifyTime);
        set(10, lastModifyUserId);
        set(11, isDeleted);
    }
}
