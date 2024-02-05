package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
}
