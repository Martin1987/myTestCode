package com.xcj.transaction;

import java.util.List;
import java.sql.SQLException;

public interface DeptbakDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	void insert(Deptbak record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int updateByPrimaryKey(Deptbak record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int updateByPrimaryKeySelective(Deptbak record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	List selectByExample(DeptbakExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	Deptbak selectByPrimaryKey(Short deptno);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int deleteByExample(DeptbakExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int deleteByPrimaryKey(Short deptno);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int countByExample(DeptbakExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int updateByExampleSelective(Deptbak record, DeptbakExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table SCOTT.DEPTBAK
	 * @abatorgenerated  Sun Mar 17 19:21:29 CST 2013
	 */
	int updateByExample(Deptbak record, DeptbakExample example);
}