package com.springboot.testcode;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * @BeforeAll : 전체 테스트 동작에서 처음과 마지막에만 각각 수행
 * @AfterAll : 전체 테스트 동작에서 처음과 마지막에만 각각 수행
 *
 * @BeforeEach : 각 테스트가 실행될 때 @Test 어노테이션이 지정된 테스트 메서드를 기준으로 실행됨
 * @AfterEach  : 각 테스트가 실행될 때 @Test 어노테이션이 지정된 테스트 메서드를 기준으로 실행됨
 *
 * @Disabled : 지정된 테스트는 실행되지 않음
 * */
public class TestLifeCycle {

    @BeforeAll
    static void beforeAll() {
        System.out.println("## BeforeAll Annotation 호출 ##");
        System.out.println();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("## AfterAll Annotation 호출 ##");
        System.out.println();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("## BeforeEach Annotation 호출 ##");
        System.out.println();
    }

    @AfterEach
    void afterEach() {
        System.out.println("## AfterEach Annotation 호출 ##");
        System.out.println();
    }

    @Test
    void test1 () {
        System.out.println("## test1 시작 ##");
        System.out.println();
    }

    @Test
    @DisplayName("Test Case2!!!")
    void test2() {
        System.out.println("## test2 시작 ##");
        System.out.println();
    }

    @Test
    @Disabled
    void test3() {
        System.out.println("## test3 시작 ##");
        System.out.println();
    }

}
