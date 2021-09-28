package edu.bjtu.back.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: Product
 * Description:
 * date: 2021-09-26 21:30
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@ToString
public class Product {

    // id
    private String id;

    // 统一物品类别编码
    private String productCategoryCode;

    // 物品类别名称
    private String productCategoryName;

    // 商品编码
    private String productCode;

    // 商品名称
    private String productName;

    // 产品图文件ID
    private String productFileId;

    // 规格型号
    private String productFormat;

    // 计价单位
    private String unit;

    // 计价单价
    private String price;

    // 创建时间
    private long createTime;

    // 更新时间
    private long updateTime;

    // 创建人id
    private long createUserId;

    // 更新人id
    private long updateUserId;

    // 组织id
    private int deptId;

    public Product(String id, String productCategoryCode, String productCategoryName, String productCode, String productName, String productFileId, String productFormat, String unit, String price, long createTime, long updateTime, long createUserId, long updateUserId, int deptId) {
        this.id = id;
        this.productCategoryCode = productCategoryCode;
        this.productCategoryName = productCategoryName;
        this.productCode = productCode;
        this.productName = productName;
        this.productFileId = productFileId;
        this.productFormat = productFormat;
        this.unit = unit;
        this.price = price;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createUserId = createUserId;
        this.updateUserId = updateUserId;
        this.deptId = deptId;
    }
}
