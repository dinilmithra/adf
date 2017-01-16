package com.dm.adf.common.baseapp.testmodel.test.service;


import com.dm.adf.common.baseapp.testmodel.test.service.common.PrgHRService;
import com.dm.adf.common.baseapp.testmodel.test.vo.PGEmployeeVOImpl;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 09 21:27:39 PST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PrgHRServiceImpl extends ApplicationModuleImpl implements PrgHRService {
    /**
     * This is the default constructor (do not remove).
     */
    public PrgHRServiceImpl() {
    }

    public void test() {
        System.out.println("Hai");

        ApplicationModule appMod = null;
        try {
            appMod =
                    Configuration.createRootApplicationModule("com.dm.adf.common.baseapp.testmodel.hr.service.HRService",
                                                              "HRServiceLocal");
            ViewObjectImpl vo =
                (ViewObjectImpl)appMod.findViewObject("EmployeesView1");
            long count = vo.getEstimatedRowCount();
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (appMod != null) {
                Configuration.releaseRootApplicationModule(appMod, false);
            }
        }
    }

    /**
     * Container's getter for PGEmployeeVO1.
     * @return PGEmployeeVO1
     */
    public PGEmployeeVOImpl getPGEmployeeVO1() {
        return (PGEmployeeVOImpl)findViewObject("PGEmployeeVO1");
    }
}