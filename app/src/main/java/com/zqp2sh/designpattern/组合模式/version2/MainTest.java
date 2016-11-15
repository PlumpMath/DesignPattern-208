package com.zqp2sh.designpattern.组合模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 19:51
 */

public class MainTest {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company = new ConcreteCompany("上海华东分公司");
        company.add(new HRDepartment("上海华东分公司人力资源部"));
        company.add(new FinanceDepartment("上海华东分公司财务部"));
        root.add(company);

        ConcreteCompany company1 = new ConcreteCompany("南京办事处");
        company1.add(new HRDepartment("南京办事处人力资源部"));
        company1.add(new FinanceDepartment("南京办事处财政部"));
        company.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("杭州办事处");
        company2.add(new HRDepartment("杭州办事处人力资源部"));
        company2.add(new FinanceDepartment("杭州办事处财政部"));
        company.add(company2);

        System.out.println("---公司结构图---");
        root.display(0);

        System.out.println("---公司职责图---");
        root.lineOfDuty();

    }
}
