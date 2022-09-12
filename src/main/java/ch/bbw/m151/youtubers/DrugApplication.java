package ch.bbw.m151.youtubers;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class DrugApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public org.h2.tools.Server inMemoryH2DatabaseaServer() throws SQLException {
		// connectable on: jdbc:h2:tcp://localhost:9090/mem:mydb
		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}
}

