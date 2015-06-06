package demo;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringApplicationConfiguration
public class ServiceTest extends BaseTest {
	@Autowired
	Service service;

	@Test
	public void testAction() {
		service.action();
	}

	@Configuration
	public static class Config {
		@Mock Component mock;

		public Config() {
			MockitoAnnotations.initMocks(this);
		}

		@Bean
		public Component component() {
			Mockito.when(mock.action()).thenReturn("mock action");
			return mock;
		}
	}

}
