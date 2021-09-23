package edu.bjtu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: TraceResult
 * Description:
 * date: 2021-09-23 10:57
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TraceResult {

    // 溯源码
    private String traceId;

    // 区块链名称
    private String blockChainName;

    // 品名
    private String productName;

    // 销售公司
    private String saleCompany;

    // 单价
    private double price;

    // 交易哈希
    private String tHash;

    // 所在区块
    private int blockNumber;

    // 交易时间戳
    private String timeStamp;
}
