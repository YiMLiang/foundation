/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.security;


import com.wuda.foundation.jooq.code.generation.security.tables.PermissionAction;
import com.wuda.foundation.jooq.code.generation.security.tables.PermissionAssignment;
import com.wuda.foundation.jooq.code.generation.security.tables.PermissionCategory;
import com.wuda.foundation.jooq.code.generation.security.tables.PermissionTarget;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>foundation_security</code> 
 * schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PERMISSION_ACTION_FK_PERMISSION_TARGET_ID = Indexes0.PERMISSION_ACTION_FK_PERMISSION_TARGET_ID;
    public static final Index PERMISSION_ACTION_IDX_REFERENCED_OBJECT = Indexes0.PERMISSION_ACTION_IDX_REFERENCED_OBJECT;
    public static final Index PERMISSION_ASSIGNMENT_IDX_ACTION = Indexes0.PERMISSION_ASSIGNMENT_IDX_ACTION;
    public static final Index PERMISSION_ASSIGNMENT_IDX_SUBJECT = Indexes0.PERMISSION_ASSIGNMENT_IDX_SUBJECT;
    public static final Index PERMISSION_ASSIGNMENT_IDX_TARGET = Indexes0.PERMISSION_ASSIGNMENT_IDX_TARGET;
    public static final Index PERMISSION_CATEGORY_IDX_PARENT_ID = Indexes0.PERMISSION_CATEGORY_IDX_PARENT_ID;
    public static final Index PERMISSION_TARGET_FK_PERMISSION_CATEGORY_ID = Indexes0.PERMISSION_TARGET_FK_PERMISSION_CATEGORY_ID;
    public static final Index PERMISSION_TARGET_IDX_REFERENCED = Indexes0.PERMISSION_TARGET_IDX_REFERENCED;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PERMISSION_ACTION_FK_PERMISSION_TARGET_ID = Internal.createIndex("fk_permission_target_id", PermissionAction.PERMISSION_ACTION, new OrderField[] { PermissionAction.PERMISSION_ACTION.PERMISSION_TARGET_ID }, false);
        public static Index PERMISSION_ACTION_IDX_REFERENCED_OBJECT = Internal.createIndex("idx_referenced_object", PermissionAction.PERMISSION_ACTION, new OrderField[] { PermissionAction.PERMISSION_ACTION.REFERENCED_TYPE, PermissionAction.PERMISSION_ACTION.REFERENCED_IDENTIFIER }, false);
        public static Index PERMISSION_ASSIGNMENT_IDX_ACTION = Internal.createIndex("idx_action", PermissionAssignment.PERMISSION_ASSIGNMENT, new OrderField[] { PermissionAssignment.PERMISSION_ASSIGNMENT.ACTION_IDENTIFIER }, false);
        public static Index PERMISSION_ASSIGNMENT_IDX_SUBJECT = Internal.createIndex("idx_subject", PermissionAssignment.PERMISSION_ASSIGNMENT, new OrderField[] { PermissionAssignment.PERMISSION_ASSIGNMENT.SUBJECT_IDENTIFIER }, false);
        public static Index PERMISSION_ASSIGNMENT_IDX_TARGET = Internal.createIndex("idx_target", PermissionAssignment.PERMISSION_ASSIGNMENT, new OrderField[] { PermissionAssignment.PERMISSION_ASSIGNMENT.TARGET_IDENTIFIER }, false);
        public static Index PERMISSION_CATEGORY_IDX_PARENT_ID = Internal.createIndex("idx_parent_id", PermissionCategory.PERMISSION_CATEGORY, new OrderField[] { PermissionCategory.PERMISSION_CATEGORY.PARENT_ID }, false);
        public static Index PERMISSION_TARGET_FK_PERMISSION_CATEGORY_ID = Internal.createIndex("fk_permission_category_id", PermissionTarget.PERMISSION_TARGET, new OrderField[] { PermissionTarget.PERMISSION_TARGET.PERMISSION_CATEGORY_ID }, false);
        public static Index PERMISSION_TARGET_IDX_REFERENCED = Internal.createIndex("idx_referenced", PermissionTarget.PERMISSION_TARGET, new OrderField[] { PermissionTarget.PERMISSION_TARGET.REFERENCED_TYPE, PermissionTarget.PERMISSION_TARGET.REFERENCED_IDENTIFIER }, false);
    }
}
