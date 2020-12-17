/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.commons;


import com.wuda.foundation.jooq.code.generation.commons.tables.AdministrativeUnit;
import com.wuda.foundation.jooq.code.generation.commons.tables.Email;
import com.wuda.foundation.jooq.code.generation.commons.tables.FlowHistory;
import com.wuda.foundation.jooq.code.generation.commons.tables.MenuCore;
import com.wuda.foundation.jooq.code.generation.commons.tables.MenuItemBelongsToCategory;
import com.wuda.foundation.jooq.code.generation.commons.tables.MenuItemCategory;
import com.wuda.foundation.jooq.code.generation.commons.tables.MenuItemCore;
import com.wuda.foundation.jooq.code.generation.commons.tables.Phone;
import com.wuda.foundation.jooq.code.generation.commons.tables.PropertyKey;
import com.wuda.foundation.jooq.code.generation.commons.tables.PropertyKeyDefinition;
import com.wuda.foundation.jooq.code.generation.commons.tables.PropertyMount;
import com.wuda.foundation.jooq.code.generation.commons.tables.PropertyValue;
import com.wuda.foundation.jooq.code.generation.commons.tables.Task;
import com.wuda.foundation.jooq.code.generation.commons.tables.TaskLog;
import com.wuda.foundation.jooq.code.generation.commons.tables.TaskPhase;
import com.wuda.foundation.jooq.code.generation.commons.tables.Variable;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoundationCommons extends SchemaImpl {

    private static final long serialVersionUID = 1462328473;

    /**
     * The reference instance of <code>foundation_commons</code>
     */
    public static final FoundationCommons FOUNDATION_COMMONS = new FoundationCommons();

    /**
     * 行政单元，行政区域划分。也就是省市区等数据，不按省市区建表，因为不一定是按那样划分，比如北京，深圳，但是他们有一个共同特点，那就是有上下级关系，因此用ID/PID的方式组织。
     */
    public final AdministrativeUnit ADMINISTRATIVE_UNIT = AdministrativeUnit.ADMINISTRATIVE_UNIT;

    /**
     * email信息
     */
    public final Email EMAIL = Email.EMAIL;

    /**
     * 流程处理历史记录
     */
    public final FlowHistory FLOW_HISTORY = FlowHistory.FLOW_HISTORY;

    /**
     * 菜单核心信息。一个站点，可以制作多个菜单，比如为A场景制作一份菜单，为B场景制作一份菜单。每个菜单有它自己【独立的分类】，因为每个菜单的内容都不一样；但是最底层的菜单项是共享的，因为站点所能提供的功能是一致的，只是每个菜单组合了不同的功能而已。
     */
    public final MenuCore MENU_CORE = MenuCore.MENU_CORE;

    /**
     * 表示menu item所属的分类
     */
    public final MenuItemBelongsToCategory MENU_ITEM_BELONGS_TO_CATEGORY = MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY;

    /**
     * 物品分类
     */
    public final MenuItemCategory MENU_ITEM_CATEGORY = MenuItemCategory.MENU_ITEM_CATEGORY;

    /**
     * 可以代表站点的功能菜单中的一个具体功能，导航栏菜单（Navigation menu）中的一个具体项等等，这些item可能是按钮，链接等。参考Android的Menu，MenuItem，https://developer.android.com/reference/android/view/MenuItem。
     */
    public final MenuItemCore MENU_ITEM_CORE = MenuItemCore.MENU_ITEM_CORE;

    /**
     * 电话信息。
     */
    public final Phone PHONE = Phone.PHONE;

    /**
     * 属性的key
     */
    public final PropertyKey PROPERTY_KEY = PropertyKey.PROPERTY_KEY;

    /**
     * property key 的定义，就好像是数据库表中列的定义是类似的
     */
    public final PropertyKeyDefinition PROPERTY_KEY_DEFINITION = PropertyKeyDefinition.PROPERTY_KEY_DEFINITION;

    /**
     * 属性模板的挂载点，比如对于商品来说，相同分类下的商品属性很擂台，因此可以把属性模板挂载到商品分类上，在新建商品时就可以推荐相关的属性模板了
     */
    public final PropertyMount PROPERTY_MOUNT = PropertyMount.PROPERTY_MOUNT;

    /**
     * 属性的值
     */
    public final PropertyValue PROPERTY_VALUE = PropertyValue.PROPERTY_VALUE;

    /**
     * 任务
     */
    public final Task TASK = Task.TASK;

    /**
     * 任务的日志
     */
    public final TaskLog TASK_LOG = TaskLog.TASK_LOG;

    /**
     * 任务的某个阶段
     */
    public final TaskPhase TASK_PHASE = TaskPhase.TASK_PHASE;

    /**
     * 简单的变量，使用name-value pair表示
     */
    public final Variable VARIABLE = Variable.VARIABLE;

    /**
     * No further instances allowed
     */
    private FoundationCommons() {
        super("foundation_commons", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            AdministrativeUnit.ADMINISTRATIVE_UNIT,
            Email.EMAIL,
            FlowHistory.FLOW_HISTORY,
            MenuCore.MENU_CORE,
            MenuItemBelongsToCategory.MENU_ITEM_BELONGS_TO_CATEGORY,
            MenuItemCategory.MENU_ITEM_CATEGORY,
            MenuItemCore.MENU_ITEM_CORE,
            Phone.PHONE,
            PropertyKey.PROPERTY_KEY,
            PropertyKeyDefinition.PROPERTY_KEY_DEFINITION,
            PropertyMount.PROPERTY_MOUNT,
            PropertyValue.PROPERTY_VALUE,
            Task.TASK,
            TaskLog.TASK_LOG,
            TaskPhase.TASK_PHASE,
            Variable.VARIABLE);
    }
}
