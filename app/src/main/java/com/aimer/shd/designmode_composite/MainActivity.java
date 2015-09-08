package com.aimer.shd.designmode_composite;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Company root = new ConcreteCompany();
        root.setName("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
//==========================================================================
//==========================================================================
        Company shandongRoot = new ConcreteCompany("山东分公司");
        shandongRoot.add(new HRDepartment("山东分公司人力资源部"));
        shandongRoot.add(new FinanceDepartment("山东分公司财务部"));
//-----------------------------------------------------------------------
        Company jinanRoot = new ConcreteCompany("济南办事处");
        jinanRoot.add(new HRDepartment("济南办事处人力资源部"));
        jinanRoot.add(new FinanceDepartment("济南办事处财务部"));

        shandongRoot.add(jinanRoot);
//==========================================================================
//==========================================================================
        Company shanghaiRoot = new ConcreteCompany("上海分公司");
        shanghaiRoot.add(new HRDepartment("上海分公司人力资源部"));
        shanghaiRoot.add(new FinanceDepartment("上海分公司财务部"));
//-----------------------------------------------------------------------
        Company hangzhouCom = new ConcreteCompany("杭州办事处");
        hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));
        hangzhouCom.add(new HRDepartment("杭州办事处人力资源部"));
//-----------------------------------------------------------------------
        Company nanjingCom = new ConcreteCompany("南京办事处");
        nanjingCom.add(new FinanceDepartment("南京办事处财务部"));
        nanjingCom.add(new HRDepartment("南京办事处人力资源部"));

        shanghaiRoot.add(hangzhouCom);
        shanghaiRoot.add(nanjingCom);

        root.add(shandongRoot);
        root.add(shanghaiRoot);
        root.display(0);
    }

}
