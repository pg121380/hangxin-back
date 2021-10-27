package edu.bjtu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: TraceContent
 * Description:
 * date: 2021-10-27 14:27
 *
 * @author liyifan
 */

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class TraceContent {

    private int sort;

    private String labelName;

    private String labelValue;

    private String fileName;

    private String fileId;
}
