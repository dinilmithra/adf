package com.dm.adf.common.baseapp.testmodel.test;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;
import oracle.jbo.server.DatabaseTransactionFactory;
import oracle.jbo.server.ViewObjectImpl;

public class TestAm {
    public TestAm() {
        super();
    }

    public static void main(String[] str) {
        test();
    }

    public static void test() {
        System.out.println("Hai");

        ApplicationModule appMod = null;
        try {
            appMod =
                    Configuration.createRootApplicationModule("com.dm.adf.common.baseapp.testmodel.hr.service.HRService",
                                                              "HRServiceLocal");
            ViewObjectImpl vo =
                (ViewObjectImpl)appMod.findViewObject("EmployeesView1");
            vo.executeQuery();
            Long dd = vo.getEstimatedRowCount();
            System.out.println("Count: " + dd);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (appMod != null) {
                Configuration.releaseRootApplicationModule(appMod, true);
            }
        }
    }
}
