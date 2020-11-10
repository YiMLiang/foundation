/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCategory;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCore;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemDescription;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemGeneral;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemGroupRelation;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemPrice;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemVariation;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>foundation_item</code> 
 * schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ITEM_CATEGORY_IDX_PARENT = Indexes0.ITEM_CATEGORY_IDX_PARENT;
    public static final Index ITEM_CATEGORY_IDX_ROOT = Indexes0.ITEM_CATEGORY_IDX_ROOT;
    public static final Index ITEM_CATEGORY_IDX_STORE_ID = Indexes0.ITEM_CATEGORY_IDX_STORE_ID;
    public static final Index ITEM_CORE_IDX_ITEM_ID = Indexes0.ITEM_CORE_IDX_ITEM_ID;
    public static final Index ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID = Indexes0.ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID;
    public static final Index ITEM_DESCRIPTION_IDX_ITEM_ID = Indexes0.ITEM_DESCRIPTION_IDX_ITEM_ID;
    public static final Index ITEM_GENERAL_IDX_ITEM_ID = Indexes0.ITEM_GENERAL_IDX_ITEM_ID;
    public static final Index ITEM_GROUP_RELATION_IDX_ITEM_ID = Indexes0.ITEM_GROUP_RELATION_IDX_ITEM_ID;
    public static final Index ITEM_PRICE_FK_ITEM_VARIATION_ID = Indexes0.ITEM_PRICE_FK_ITEM_VARIATION_ID;
    public static final Index ITEM_PRICE_IDX_ITEM_ID = Indexes0.ITEM_PRICE_IDX_ITEM_ID;
    public static final Index ITEM_VARIATION_IDX_ITEM_ID = Indexes0.ITEM_VARIATION_IDX_ITEM_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ITEM_CATEGORY_IDX_PARENT = Internal.createIndex("idx_parent", ItemCategory.ITEM_CATEGORY, new OrderField[] { ItemCategory.ITEM_CATEGORY.PARENT_ITEM_CATEGORY_ID }, false);
        public static Index ITEM_CATEGORY_IDX_ROOT = Internal.createIndex("idx_root", ItemCategory.ITEM_CATEGORY, new OrderField[] { ItemCategory.ITEM_CATEGORY.ROOT_ITEM_CATEGORY_ID }, false);
        public static Index ITEM_CATEGORY_IDX_STORE_ID = Internal.createIndex("idx_store_id", ItemCategory.ITEM_CATEGORY, new OrderField[] { ItemCategory.ITEM_CATEGORY.STORE_ID }, false);
        public static Index ITEM_CORE_IDX_ITEM_ID = Internal.createIndex("idx_item_id", ItemCore.ITEM_CORE, new OrderField[] { ItemCore.ITEM_CORE.ITEM_ID }, false);
        public static Index ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID = Internal.createIndex("fk_item_variation_id", ItemDescription.ITEM_DESCRIPTION, new OrderField[] { ItemDescription.ITEM_DESCRIPTION.ITEM_VARIATION_ID }, false);
        public static Index ITEM_DESCRIPTION_IDX_ITEM_ID = Internal.createIndex("idx_item_id", ItemDescription.ITEM_DESCRIPTION, new OrderField[] { ItemDescription.ITEM_DESCRIPTION.ITEM_ID }, false);
        public static Index ITEM_GENERAL_IDX_ITEM_ID = Internal.createIndex("idx_item_id", ItemGeneral.ITEM_GENERAL, new OrderField[] { ItemGeneral.ITEM_GENERAL.ITEM_ID }, false);
        public static Index ITEM_GROUP_RELATION_IDX_ITEM_ID = Internal.createIndex("idx_item_id", ItemGroupRelation.ITEM_GROUP_RELATION, new OrderField[] { ItemGroupRelation.ITEM_GROUP_RELATION.ITEM_ID }, false);
        public static Index ITEM_PRICE_FK_ITEM_VARIATION_ID = Internal.createIndex("fk_item_variation_id", ItemPrice.ITEM_PRICE, new OrderField[] { ItemPrice.ITEM_PRICE.ITEM_VARIATION_ID }, false);
        public static Index ITEM_PRICE_IDX_ITEM_ID = Internal.createIndex("idx_item_id", ItemPrice.ITEM_PRICE, new OrderField[] { ItemPrice.ITEM_PRICE.ITEM_ID }, false);
        public static Index ITEM_VARIATION_IDX_ITEM_ID = Internal.createIndex("idx_item_id", ItemVariation.ITEM_VARIATION, new OrderField[] { ItemVariation.ITEM_VARIATION.ITEM_ID }, false);
    }
}
