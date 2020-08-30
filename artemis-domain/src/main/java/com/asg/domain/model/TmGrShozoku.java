package com.asg.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TM_GR_SHOZOKU
 */
@Data
public class TmGrShozoku implements Serializable {
    /**
     * Database Column Remarks:
     *   会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_KAISHA
     *
     * @mbg.generated
     */
    private String cdKaisha;

    /**
     * Database Column Remarks:
     *   グループID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_GROUP
     *
     * @mbg.generated
     */
    private String cdGroup;

    /**
     * Database Column Remarks:
     *   ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_USER
     *
     * @mbg.generated
     */
    private String cdUser;

    /**
     * Database Column Remarks:
     *   管理区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_KANRI
     *
     * @mbg.generated
     */
    private String cdKanri;

    /**
     * Database Column Remarks:
     *   最終更新会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_LU_KAISHA
     *
     * @mbg.generated
     */
    private String cdLuKaisha;

    /**
     * Database Column Remarks:
     *   最終更新者ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_LU_USER
     *
     * @mbg.generated
     */
    private String cdLuUser;

    /**
     * Database Column Remarks:
     *   最終更新日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.TM_LU
     *
     * @mbg.generated
     */
    private LocalDateTime tmLu;

    /**
     * Database Column Remarks:
     *   使用停止区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_GR_SHOZOKU.CD_TEISHI
     *
     * @mbg.generated
     */
    private String cdTeishi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_GR_SHOZOKU
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}