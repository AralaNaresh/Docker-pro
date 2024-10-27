package com.tcs.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.tcs.dao.UserDao;

@SpringBootTest
@ExtendWith(value = { MockitoExtension.class })
public class UserTest {

	@MockBean
	private UserDao userDao;

	@InjectMocks
	private UserService userService;

	@Test
	public void testGetName() {
		when(userDao.finaName(101)).thenReturn("Arala");
		when(userDao.finaName(102)).thenReturn("Naresh");

		String name = userService.getName(101);
		assertNotNull(name);

	}

}
