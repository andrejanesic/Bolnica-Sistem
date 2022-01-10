package rs.raf.UI.P2.andreja_nesic.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.UI.P2.andreja_nesic.controller.BlokController;
import rs.raf.UI.P2.andreja_nesic.controller.CustomUtils;
import rs.raf.UI.P2.andreja_nesic.dto.BlokDto;
import rs.raf.UI.P2.andreja_nesic.mapper.BlokMapper;
import rs.raf.UI.P2.andreja_nesic.mapper.EntityMapper;
import rs.raf.UI.P2.andreja_nesic.model.Blok;
import rs.raf.UI.P2.andreja_nesic.service.BlokService;

import java.util.Arrays;
import java.util.Collections;

@Transactional
public class BlokControllerTest {
    private static final String ENDPOINT_URL = "/api/blok;@InjectMocks
    private BlokController blokController;
    @Mock
    private BlokService blokService;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(blokController)
                //.setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                //.addFilter(CustomFilter::doFilter)
                .build();
    }

    @Test
    public void findAllByPage() throws Exception {
        Page<BlokDto> page = new PageImpl<>(Collections.singletonList(BlokBuilder.getDto()));

        Mockito.when(blokService.findByCondition(ArgumentMatchers.any(), ArgumentMatchers.any())).thenReturn(page);

        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.content", Matchers.hasSize(1)));

        Mockito.verify(blokService, Mockito.times(1)).findByCondition(ArgumentMatchers.any(), ArgumentMatchers.any());
        Mockito.verifyNoMoreInteractions(blokService);

    }

    @Test
    public void getById() throws Exception {
        Mockito.when(blokService.findById(ArgumentMatchers.anyInt())).thenReturn(BlokBuilder.getDto());

        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
        Mockito.verify(blokService, Mockito.times(1)).findById("1");
        Mockito.verifyNoMoreInteractions(blokService);
    }

    @Test
    public void save() throws Exception {
        Mockito.when(blokService.save(ArgumentMatchers.any(BlokDto.class))).thenReturn(BlokBuilder.getDto());

        mockMvc.perform(
                        MockMvcRequestBuilders.post(ENDPOINT_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(BlokBuilder.getDto())))
                .andExpect(MockMvcResultMatchers.status().isCreated());
        Mockito.verify(blokService, Mockito.times(1)).save(ArgumentMatchers.any(BlokDto.class));
        Mockito.verifyNoMoreInteractions(blokService);
    }

    @Test
    public void update() throws Exception {
        Mockito.when(blokService.update(ArgumentMatchers.any(), ArgumentMatchers.anyInt())).thenReturn(BlokBuilder.getDto());

        mockMvc.perform(
                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(BlokBuilder.getDto())))
                .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(blokService, Mockito.times(1)).update(ArgumentMatchers.any(BlokDto.class), ArgumentMatchers.anyInt());
        Mockito.verifyNoMoreInteractions(blokService);
    }

    @Test
    public void delete() throws Exception {
        Mockito.doNothing().when(blokService).deleteById(ArgumentMatchers.anyInt());
        mockMvc.perform(
                MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(CustomUtils.asJsonString(BlokBuilder.getIds()))).andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(blokService, Mockito.times(1)).deleteById(Mockito.anyInt());
        Mockito.verifyNoMoreInteractions(blokService);
    }
}