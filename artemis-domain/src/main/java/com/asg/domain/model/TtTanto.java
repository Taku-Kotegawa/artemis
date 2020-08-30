package com.asg.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TT_TANTO
 */
@Data
public class TtTanto implements Serializable {
    /**
     * Database Column Remarks:
     *   内部件名ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.CD_KENMEI
     *
     * @mbg.generated
     */
    private String cdKenmei;

    /**
     * Database Column Remarks:
     *   会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.CD_KAISHA
     *
     * @mbg.generated
     */
    private String cdKaisha;

    /**
     * Database Column Remarks:
     *   ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.CD_USER
     *
     * @mbg.generated
     */
    private String cdUser;

    /**
     * Database Column Remarks:
     *   ASG件名ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.CD_ASGKENMEI
     *
     * @mbg.generated
     */
    private String cdAsgkenmei;

    /**
     * Database Column Remarks:
     *   最終更新会社コード
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.CD_LU_KAISHA
     *
     * @mbg.generated
     */
    private String cdLuKaisha;

    /**
     * Database Column Remarks:
     *   最終更新者ユーザID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.CD_LU_USER
     *
     * @mbg.generated
     */
    private String cdLuUser;

    /**
     * Database Column Remarks:
     *   最終更新日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_TANTO.TM_LU
     *
     * @mbg.generated
     */
    private LocalDateTime tmLu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}