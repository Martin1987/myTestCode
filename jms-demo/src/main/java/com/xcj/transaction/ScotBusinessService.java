package com.xcj.transaction;

import java.sql.SQLException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class ScotBusinessService
{
    private DeptDAO deptDao;

    private DeptpkDAO deptPkDao;

    @Transactional(rollbackFor = SQLException.class)
    public void addDepartment(Dept dept)
        throws SQLException
    {
        deptDao.insert(dept);
        DeptpkExample example = new DeptpkExample();
        example.createCriteria().addCriterion("deptno=" + dept.getDeptno());
        List<Deptpk> pks = deptPkDao.selectByExample(example);
        if (pks == null || pks.isEmpty() || !pks.contains(dept.getDeptno()))
        {
            throw new SQLException();
        }

    }
}
