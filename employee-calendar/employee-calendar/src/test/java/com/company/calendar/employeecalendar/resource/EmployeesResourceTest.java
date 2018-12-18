package com.company.calendar.employeecalendar.resource;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)

public class EmployeesResourceTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private EmployeesResource employeeResource;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(employeeResource)
				.build();
	}
	
	@Test
	public void testEmployeeResource() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/employees/all"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}

}
