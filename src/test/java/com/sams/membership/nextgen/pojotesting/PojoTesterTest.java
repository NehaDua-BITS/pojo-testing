package com.sams.membership.nextgen.pojotesting;

import org.junit.Test;
import pl.pojo.tester.api.DefaultPackageFilter;
import pl.pojo.tester.api.assertion.Method;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsForAll;

public class PojoTesterTest
{
    private static final String POJO_PACKAGE = "com.sams.membership.nextgen.pojotesting.models";

    @Test
    public void testPackage() {
        assertPojoMethodsForAll(DefaultPackageFilter.forPackage(POJO_PACKAGE)).testing(Method.GETTER, Method.SETTER)
                .areWellImplemented();
    }

    @Test
    public void testPojoClass() {
        final Class<?> classUnderTest = Person.class;
        assertPojoMethodsFor(classUnderTest).testing(Method.GETTER, Method.SETTER, Method.TO_STRING)
                .testing(Method.EQUALS)
                .testing(Method.HASH_CODE)
                .testing(Method.CONSTRUCTOR)
                .areWellImplemented();


    }
}