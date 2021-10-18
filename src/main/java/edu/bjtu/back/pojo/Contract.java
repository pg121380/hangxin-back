package edu.bjtu.back.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: Contract
 * Description:
 * date: 2021-10-18 19:35
 *
 * @author liyifan
 */

@Data
@ToString
@NoArgsConstructor
public class Contract {

    private String id;

    private String wordFile;

    private String wordName;

    private String signEndTime;

    private String wordMark;

    private String partyAName;

    private String partyACode;

    private String partyAUser;

    private String partyAPho;

    private String partyBName;

    private String partyBCode;

    private String partyBUser;

    private String partyBPho;

    private String wordStatus;

    private String statusMark;

    private String opStatus;

    private String partyASeal;

    private String partyASealPoint;

    private String partyASealTime;

    private String partyBSeal;

    private String partyBSealPoint;

    private String partyBSealTime;

    private String wordFinalFile;

    private String createBy;

    private String createTime;

    private String updateTime;

    public Contract(String id, String wordFile, String wordName, String signEndTime, String wordMark, String partyAName, String partyACode, String partyAUser, String partyAPho, String partyBName, String partyBCode, String partyBUser, String partyBPho, String wordStatus, String statusMark, String opStatus, String partyASeal, String partyASealPoint, String partyASealTime, String partyBSeal, String partyBSealPoint, String partyBSealTime, String wordFinalFile, String createBy, String createTime, String updateTime) {
        this.id = id;
        this.wordFile = wordFile;
        this.wordName = wordName;
        this.signEndTime = signEndTime;
        this.wordMark = wordMark;
        this.partyAName = partyAName;
        this.partyACode = partyACode;
        this.partyAUser = partyAUser;
        this.partyAPho = partyAPho;
        this.partyBName = partyBName;
        this.partyBCode = partyBCode;
        this.partyBUser = partyBUser;
        this.partyBPho = partyBPho;
        this.wordStatus = wordStatus;
        this.statusMark = statusMark;
        this.opStatus = opStatus;
        this.partyASeal = partyASeal;
        this.partyASealPoint = partyASealPoint;
        this.partyASealTime = partyASealTime;
        this.partyBSeal = partyBSeal;
        this.partyBSealPoint = partyBSealPoint;
        this.partyBSealTime = partyBSealTime;
        this.wordFinalFile = wordFinalFile;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
