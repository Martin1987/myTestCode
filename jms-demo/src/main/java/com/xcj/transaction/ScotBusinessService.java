package com.xcj.transaction;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class ScotBusinessService
{
    private DeptDAO deptDao;

    private DeptbakDAO deptbakDao;

    @Transactional(rollbackFor = SQLException.class)
    public void addDepartment(Dept dept)
        throws SQLException
    {
        deptDao.insert(dept);
        Dept dep = deptDao.selectByPrimaryKey(new Short("50"));
        System.out.println(dep.getDname());
        Deptbak bak = deptbakDao.selectByPrimaryKey(dept.getDeptno());
        if (bak == null)
        {
            throw new SQLException();
        }

    }
    
    public DeptDAO getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDAO deptDao) {
		this.deptDao = deptDao;
	}

	public DeptbakDAO getDeptbakDao() {
		return deptbakDao;
	}

	public void setDeptbakDao(DeptbakDAO deptbakDao) {
		this.deptbakDao = deptbakDao;
	}

	public static void main(String[] args){
    	ApplicationContext context = new ClassPathXmlApplicationContext("transaction-context.xml");
    	Dept dept = new Dept();
    	dept.setDeptno(new Short("50"));
    	dept.setDname("test");
    	dept.setLoc("testLoc");
    	
    	ScotBusinessService bs = (ScotBusinessService) context.getBean("scottBS");
    	try {
			bs.addDepartment(dept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
