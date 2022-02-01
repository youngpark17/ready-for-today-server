package com.pyu.rft.controller;

import com.pyu.rft.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/*
* SampleController 로 클래스명 작성시 매핑 제대로 되지 않음.
* SampleControllerTests로 클래스명 작성시 테스트 정상 작동...
* TODO @AutoConfigureMockMvc 매핑 방법 확인
* */
public class SampleControllerTest extends BaseTest {
    public SampleControllerTest() {
        super("/api/v1");
    }

    @Test
    @DisplayName("성공")
    void successTest() throws Exception {
        success(reqGet(""))
                .andExpect(jsonPath("$.response").value("성공"));
    }
}
