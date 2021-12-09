package edu.bjtu.back.controller.model_library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: CurrentStock
 * Description:
 * date: 2021-12-09 15:56
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CurrentStock {

    private String key;

    private String value;
}
