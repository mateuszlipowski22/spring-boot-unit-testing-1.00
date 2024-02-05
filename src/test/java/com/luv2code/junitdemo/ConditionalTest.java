package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {
    @Test
    @Disabled("Dont run until JIRA #123 is resolved")
    void basicTest(){

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){

    }

    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS})
    void testForLinuxAndWindowsOnly(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForJava13Only(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForJava17Only(){

    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_17,max=JRE.JAVA_21)
    void testForJavaRange(){

    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13)
    void testForJavaMin(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUC2CODE_ENV",matches = "DEV")
    void testOnlyForDevEnvironment(){

    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP",matches = "CI_CD_DEPLOY")
    void testOnlyForSysProperty(){

    }
}
