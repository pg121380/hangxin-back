package edu.bjtu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: TraceConfigProduct
 * Description:
 * date: 2021-10-27 14:25
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@ToString
public class TraceConfigProduct {

    private String type;

    private String labelName;

    private String labelValue;

    private String fileId;

    public TraceConfigProduct(String type, String labelName, String labelValue, String fileId) {
        this.type = type;
        this.labelName = labelName;
        this.labelValue = labelValue;
        this.fileId = fileId;
    }
}
