package com.sams.membership.nextgen.pojotesting;

import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class OpenPojoTest
{
    private static final String POJO_PACKAGE = "com.sams.membership.nextgen.pojotesting.models";

    @Test
    //@Ignore
    public void testPojoStructureAndBehavior() {
        System.out.println("executing OpenPojoTest class");
        Validator validator = ValidatorBuilder.create()
                // Add Rules to validate structure for POJO_PACKAGE
                .with(new GetterMustExistRule())
                .with(new SetterMustExistRule())
                // Add Testers to validate behaviour for POJO_PACKAGE
                .with(new SetterTester())
                .with(new GetterTester())
                .build();

        validator.validate(POJO_PACKAGE, new FilterPackageInfo());

        //To test single class
        /*
        PojoClass pojoClass = PojoClassFactory.getPojoClass(Person.class);
        validator.validate(pojoClass);
       */
    }


}
