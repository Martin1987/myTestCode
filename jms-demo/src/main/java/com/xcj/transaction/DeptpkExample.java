package com.xcj.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptpkExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public DeptpkExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    protected DeptpkExample(DeptpkExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table SCOTT.DEPTPK
     *
     * @abatorgenerated Tue Mar 12 17:25:30 CST 2013
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andDeptnoIsNull() {
            addCriterion("DEPTNO is null");
            return this;
        }

        public Criteria andDeptnoIsNotNull() {
            addCriterion("DEPTNO is not null");
            return this;
        }

        public Criteria andDeptnoEqualTo(Short value) {
            addCriterion("DEPTNO =", value, "deptno");
            return this;
        }

        public Criteria andDeptnoNotEqualTo(Short value) {
            addCriterion("DEPTNO <>", value, "deptno");
            return this;
        }

        public Criteria andDeptnoGreaterThan(Short value) {
            addCriterion("DEPTNO >", value, "deptno");
            return this;
        }

        public Criteria andDeptnoGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPTNO >=", value, "deptno");
            return this;
        }

        public Criteria andDeptnoLessThan(Short value) {
            addCriterion("DEPTNO <", value, "deptno");
            return this;
        }

        public Criteria andDeptnoLessThanOrEqualTo(Short value) {
            addCriterion("DEPTNO <=", value, "deptno");
            return this;
        }

        public Criteria andDeptnoIn(List values) {
            addCriterion("DEPTNO in", values, "deptno");
            return this;
        }

        public Criteria andDeptnoNotIn(List values) {
            addCriterion("DEPTNO not in", values, "deptno");
            return this;
        }

        public Criteria andDeptnoBetween(Short value1, Short value2) {
            addCriterion("DEPTNO between", value1, value2, "deptno");
            return this;
        }

        public Criteria andDeptnoNotBetween(Short value1, Short value2) {
            addCriterion("DEPTNO not between", value1, value2, "deptno");
            return this;
        }
    }
}