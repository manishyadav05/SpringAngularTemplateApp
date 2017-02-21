package com.epcor.appservices;

import com.epcor.appservices.servlet.NavigationController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by manis on 2/19/2017.
 */
public class NavigationControllerTest {

    @InjectMocks
    NavigationController controller;

    MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test

    public void testGet() throws Exception {
        mockMvc.perform(get("/getJsonObject")).andDo(print());
    }

    @Test

    public void testPost() throws Exception {
        mockMvc.perform(post("/postJsonObject")
                .content("{\"title\":\"AppServicesSupportApp\"}")
            .contentType(MediaType.APPLICATION_JSON))
                //.andExpect(jsonPath("$.title", is("ApplicationServicesSupportApp")))
                .andDo(print());

    }

}
