package edu.bjtu.back.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: OrderFolwWithUserVo
 * Description:
 * date: 2021-09-26 15:17
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@ToString
public class OrderFlowWithUserVo {

    // id
    private String id;

    // 采购单号
    private String purchaseNo;

    // 销售单号
    private String saleNo;

    // 操作
    private String handle;

    // 订单意见
    private String content;

    // 操作时间
    private long createTime;

    // 创建人id
    private long createUserId;

    // 组织id
    private long deptId;

    // 公司名称
    private String companyName;

    // 机构名称
    private int deptName;

    // 人员名称
    private int account;

    public OrderFlowWithUserVo(String id, String purchaseNo, String saleNo, String handle, String content, long createTime, long createUserId, long deptId, String companyName, int deptName, int account) {
        this.id = id;
        this.purchaseNo = purchaseNo;
        this.saleNo = saleNo;
        this.handle = handle;
        this.content = content;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.deptId = deptId;
        this.companyName = companyName;
        this.deptName = deptName;
        this.account = account;
    }
}
