package com.asg.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TM_MAIL_KANRI
 */
@Data
public class TmMailKanri implements Serializable {
    /**
     * Database Column Remarks:
     *   旧回線状態区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_KS_JT_KYU
     *
     * @mbg.generated
     */
    private String cdKsJtKyu;

    /**
     * Database Column Remarks:
     *   更新者会社区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_KOSHINSHA_KAISHA
     *
     * @mbg.generated
     */
    private String cdKoshinshaKaisha;

    /**
     * Database Column Remarks:
     *   保存区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_HOZON
     *
     * @mbg.generated
     */
    private String cdHozon;

    /**
     * Database Column Remarks:
     *   状態指示区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_JT_SHIJI
     *
     * @mbg.generated
     */
    private String cdJtShiji;

    /**
     * Database Column Remarks:
     *   新回線状態
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_KS_JT_SHIN
     *
     * @mbg.generated
     */
    private String cdKsJtShin;

    /**
     * Database Column Remarks:
     *   メール送信順序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_ML_JUN
     *
     * @mbg.generated
     */
    private String cdMlJun;

    /**
     * Database Column Remarks:
     *   メール送信先会社区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_ML_KAISHA
     *
     * @mbg.generated
     */
    private String cdMlKaisha;

    /**
     * Database Column Remarks:
     *   メール送信先会社区分（CC)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_ML_KAISHA_CC
     *
     * @mbg.generated
     */
    private String cdMlKaishaCc;

    /**
     * Database Column Remarks:
     *   メール送信判断区分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_ML_HANDAN
     *
     * @mbg.generated
     */
    private String cdMlHandan;

    /**
     * Database Column Remarks:
     *   メール送信基準
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_ML_KIJUN
     *
     * @mbg.generated
     */
    private String cdMlKijun;

    /**
     * Database Column Remarks:
     *   送信メール文書ファイル名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.DT_ML_BUNSHO
     *
     * @mbg.generated
     */
    private String dtMlBunsho;

    /**
     * Database Column Remarks:
     *   最終更新会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_LU_KAISHA
     *
     * @mbg.generated
     */
    private String cdLuKaisha;

    /**
     * Database Column Remarks:
     *   最終更新者ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.CD_LU_USER
     *
     * @mbg.generated
     */
    private String cdLuUser;

    /**
     * Database Column Remarks:
     *   最終更新日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.TM_LU
     *
     * @mbg.generated
     */
    private LocalDateTime tmLu;

    /**
     * Database Column Remarks:
     *   送信メール件名ファイル名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TM_MAIL_KANRI.DT_ML_SUBJECT
     *
     * @mbg.generated
     */
    private String dtMlSubject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_MAIL_KANRI
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}