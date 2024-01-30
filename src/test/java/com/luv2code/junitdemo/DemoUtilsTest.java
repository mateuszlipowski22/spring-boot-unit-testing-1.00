package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;

    @AfterEach
    void tearDownAfterEach(){
        demoUtils=new DemoUtils();
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all the test methods");
    }

    @BeforeEach
    void setUpBeforeEach(){
        demoUtils=new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @BeforeAll
    static void setUpBeforeEachClass(){
        System.out.println("@BeforeAll executes only once before all test methods");
    }

    @Test
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");
        assertEquals(6, demoUtils.add(2,4),"2 + 4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9),"1 + 9 must not be 6");
    }

    @Test
    void testNullAndNotNull(){
        String str1 = null;
        String str2 = "null";

        System.out.println("Running test: testNullAndNotNull");
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }
}