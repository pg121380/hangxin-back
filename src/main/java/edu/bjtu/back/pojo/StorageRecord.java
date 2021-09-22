package edu.bjtu.back.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 库存信息列表
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StorageRecord {

    private String id;

    // 物品编码
    private String goodsCode;

    // 物品名称
    private String goodsName;

    // 规格
    private String goodsFormat;

    // 单位
    private String unit;

    // 库存
    private String stockNum;

    // 仓库
    private Long repertoryId;

    // 仓库
    private String repertory;

    // 创建人
    private String createrUser;

    // 创建用户id
    private Long createUserId;

    // 创建时间
    private String createrTime;

    // 组织id
    private String deptId;

    // 更新人
    private String updateUser;

    // 更新人id
    private String updateUserId;

    // 更新时间
    private String updateTime;


}
