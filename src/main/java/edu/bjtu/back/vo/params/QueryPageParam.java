package edu.bjtu.back.vo.params;


import lombok.Data;

@Data
public class QueryPageParam {
    private int pageNo = 1;
    private int pageSize = 10;
    private String goodsCode;
    private String goodsName;
    private String repertoryId;
}
