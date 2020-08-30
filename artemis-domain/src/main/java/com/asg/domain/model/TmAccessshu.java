package com.asg.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TM_ACCESSSHU
 */
@Data
public class TmAccessshu implements Serializable {
    /**
     * Database Column Remarks:
     *   アクセス種別コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.CD_ACCESSSHU
     *
     * @mbg.generated
     */
    private String cdAccessshu;

    /**
     * Database Column Remarks:
     *   アクセス種別名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.KJ_ACCESSSHU
     *
     * @mbg.generated
     */
    private String kjAccessshu;

    /**
     * Database Column Remarks:
     *   序列
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.NM_JORETSU
     *
     * @mbg.generated
     */
    private Integer nmJoretsu;

    /**
     * Database Column Remarks:
     *   使用停止区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.CD_TEISHI
     *
     * @mbg.generated
     */
    private String cdTeishi;

    /**
     * Database Column Remarks:
     *   最終更新会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.CD_LU_KAISHA
     *
     * @mbg.generated
     */
    private String cdLuKaisha;

    /**
     * Database Column Remarks:
     *   最終更新者ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.CD_LU_USER
     *
     * @mbg.generated
     */
    private String cdLuUser;

    /**
     * Database Column Remarks:
     *   最終更新日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSSHU.TM_LU
     *
     * @mbg.generated
     */
    private LocalDateTime tmLu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_ACCESSSHU
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}