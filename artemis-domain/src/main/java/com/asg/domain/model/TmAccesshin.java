package com.asg.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TM_ACCESSHIN
 */
@Data
public class TmAccesshin implements Serializable {
    /**
     * Database Column Remarks:
     *   アクセス品目コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.CD_ACCESSHIN
     *
     * @mbg.generated
     */
    private String cdAccesshin;

    /**
     * Database Column Remarks:
     *   アクセス品目名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.KJ_ACCESSHIN
     *
     * @mbg.generated
     */
    private String kjAccesshin;

    /**
     * Database Column Remarks:
     *   序列
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.NM_JORETSU
     *
     * @mbg.generated
     */
    private Integer nmJoretsu;

    /**
     * Database Column Remarks:
     *   使用停止区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.CD_TEISHI
     *
     * @mbg.generated
     */
    private String cdTeishi;

    /**
     * Database Column Remarks:
     *   最終更新会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.CD_LU_KAISHA
     *
     * @mbg.generated
     */
    private String cdLuKaisha;

    /**
     * Database Column Remarks:
     *   最終更新者ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.CD_LU_USER
     *
     * @mbg.generated
     */
    private String cdLuUser;

    /**
     * Database Column Remarks:
     *   最終更新日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_ACCESSHIN.TM_LU
     *
     * @mbg.generated
     */
    private LocalDateTime tmLu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_ACCESSHIN
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}