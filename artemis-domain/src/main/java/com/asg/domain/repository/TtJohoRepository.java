package com.asg.domain.repository;

import com.asg.domain.model.TtJoho;
import com.asg.domain.model.TtJohoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TtJohoRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    long countByExample(TtJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int deleteByExample(TtJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long cdSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int insert(TtJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int insertSelective(TtJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    List<TtJoho> selectByExampleWithRowbounds(TtJohoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    List<TtJoho> selectByExample(TtJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    TtJoho selectByPrimaryKey(Long cdSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TtJoho record, @Param("example") TtJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TtJoho record, @Param("example") TtJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdatedSelective(TtJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TtJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdated(TtJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_JOHO
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TtJoho record);
}