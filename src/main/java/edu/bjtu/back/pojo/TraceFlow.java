package edu.bjtu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * ClassName: TraceFlow
 * Description:
 * date: 2021-10-27 14:27
 *
 * @author liyifan
 */

@Data
@ToString
@NoArgsConstructor
public class TraceFlow {

    private String labelName;

    private String labelValue;

    private String flowName;

    private String fileName;

    private String fileId;

    private String verification;

    private List<TraceContent> contentList;

    public TraceFlow(String labelName, String labelValue, String flowName, String fileName, String fileId, String verification, List<TraceContent> contentList) {
        this.labelName = labelName;
        this.labelValue = labelValue;
        this.flowName = flowName;
        this.fileName = fileName;
        this.fileId = fileId;
        this.verification = verification;
        this.contentList = contentList;
    }
}
