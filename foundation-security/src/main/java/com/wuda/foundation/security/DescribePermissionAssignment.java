package com.wuda.foundation.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * describe permission assignment.
 *
 * @author wuda
 * @since 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DescribePermissionAssignment {

    /**
     * 数据库的ID.
     */
    private Long id;

    /**
     * subject.
     */
    private Subject subject;
    /**
     * target.
     */
    private Long targetId;
    /**
     * action.
     */
    private Long actionId;
    /**
     * command.
     */
    private PermissionAssignmentCommand command;

    /**
     * 合并permission.每个{@link Subject}的permission的来源是多种多样的,并且有可能会重复,因此需要合并.
     * 比如现在有用户A,角色A,角色B,文件A,角色A有文件A的read/write权限; 角色B有文件的write/delete权限,
     * 用户A拥有角色A和角色B这两个角色,同时用户A本身也被分配了文件A的read权限,则合并后,该用户A拥有文件A的read/write/delete权限.
     *
     * @param assignments 分配的所有的权限,可能有重叠.
     * @param explain     对整个合并过程的解释说明
     * @return 合并后的权限列表
     */
    public static List<DescribePermission> merge(List<DescribePermissionAssignment> assignments, PermissionAssignmentExplain explain) {
        if (assignments == null || assignments.isEmpty()) {
            return null;
        }
        return null;
    }

}
