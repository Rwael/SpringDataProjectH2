package ch.bbw.m151.youtubers;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.boot.autoconfigure.rsocket.RSocketProperties;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class YoutubersApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubersApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public org.h2.tools.Server inMemoryH2DatabaseaServer() throws SQLException {
		// connectable on: jdbc:h2:tcp://localhost:9090/mem:mydb
		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}
}

