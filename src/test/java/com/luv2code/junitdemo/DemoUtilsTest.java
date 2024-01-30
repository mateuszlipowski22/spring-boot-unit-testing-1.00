package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @Test
    @DisplayName("Equals and not equals")
    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2,4),"2 + 4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9),"1 + 9 must not be 6");
    }

    @Test
    @DisplayName("Null and not null")
    void testNullAndNotNull(){
        String str1 = null;
        String str2 = "null";

        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }

    @Test
    @DisplayName("Same and not same")
    void testSameAndNotSame(){
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should refer to same object");
        assertNotSame(str,demoUtils.getAcademy(),"Objects should not refer to same object");
    }

    @Test
    @DisplayName("True and false")
    void testTrueFalse(){

        int gradeOne=50;
        int gradeTwo=5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne),"This should return false");
    }

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
}