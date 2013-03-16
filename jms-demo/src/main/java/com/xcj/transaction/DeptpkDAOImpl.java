package com.xcj.transaction;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;

public class DeptpkDAOImpl implements DeptpkDAO {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public DeptpkDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public void insert(Deptpk record) throws SQLException {
        sqlMapClient.insert("SCOTT_DEPTPK.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public List selectByExample(DeptpkExample example) throws SQLException {
        List list = sqlMapClient.queryForList("SCOTT_DEPTPK.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public int deleteByExample(DeptpkExample example) throws SQLException {
        int rows = sqlMapClient.delete("SCOTT_DEPTPK.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public int countByExample(DeptpkExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("SCOTT_DEPTPK.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public int updateByExampleSelective(Deptpk record, DeptpkExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("SCOTT_DEPTPK.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public int updateByExample(Deptpk record, DeptpkExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("SCOTT_DEPTPK.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    private static class UpdateByExampleParms extends DeptpkExample {
        private Object record;

        public UpdateByExampleParms(Object record, DeptpkExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}