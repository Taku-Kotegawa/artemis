package com.asg.domain.repository;

import com.asg.domain.model.TmAccessshuhin;
import com.asg.domain.model.TmAccessshuhinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TmAccessshuhinRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    long countByExample(TmAccessshuhinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int deleteByExample(TmAccessshuhinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("cdAccessshu") String cdAccessshu, @Param("cdAccesshin") String cdAccesshin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int insert(TmAccessshuhin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int insertSelective(TmAccessshuhin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    List<TmAccessshuhin> selectByExampleWithRowbounds(TmAccessshuhinExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    List<TmAccessshuhin> selectByExample(TmAccessshuhinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    TmAccessshuhin selectByPrimaryKey(@Param("cdAccessshu") String cdAccessshu, @Param("cdAccesshin") String cdAccesshin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TmAccessshuhin record, @Param("example") TmAccessshuhinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TmAccessshuhin record, @Param("example") TmAccessshuhinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdatedSelective(TmAccessshuhin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TmAccessshuhin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyAndLastUpdated(TmAccessshuhin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_ACCESSSHUHIN
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TmAccessshuhin record);
}