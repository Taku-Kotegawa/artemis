package com.asg.domain.repository;

import com.asg.domain.model.TmCode;
import com.asg.domain.model.TmCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TmCodeRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    long countByExample(TmCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int deleteByExample(TmCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("cdShu") String cdShu, @Param("cdCode") String cdCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int insert(TmCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int insertSelective(TmCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    List<TmCode> selectByExampleWithRowbounds(TmCodeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    List<TmCode> selectByExample(TmCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    TmCode selectByPrimaryKey(@Param("cdShu") String cdShu, @Param("cdCode") String cdCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TmCode record, @Param("example") TmCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TmCode record, @Param("example") TmCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdatedSelective(TmCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TmCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdated(TmCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_CODE
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TmCode record);
}