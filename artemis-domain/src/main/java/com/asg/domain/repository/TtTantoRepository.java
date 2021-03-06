package com.asg.domain.repository;

import com.asg.domain.model.TtTanto;
import com.asg.domain.model.TtTantoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TtTantoRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    long countByExample(TtTantoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int deleteByExample(TtTantoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("cdKenmei") String cdKenmei, @Param("cdKaisha") String cdKaisha);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int insert(TtTanto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int insertSelective(TtTanto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    List<TtTanto> selectByExampleWithRowbounds(TtTantoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    List<TtTanto> selectByExample(TtTantoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    TtTanto selectByPrimaryKey(@Param("cdKenmei") String cdKenmei, @Param("cdKaisha") String cdKaisha);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TtTanto record, @Param("example") TtTantoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TtTanto record, @Param("example") TtTantoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdatedSelective(TtTanto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TtTanto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdated(TtTanto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_TANTO
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TtTanto record);
}