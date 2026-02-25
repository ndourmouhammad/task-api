package sn.isi.l3gl.api.task_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"sn.isi.l3gl.api", "sn.isi.l3gl.core"})
@EnableJpaRepositories(basePackages = "sn.isi.l3gl.core.task_core.repository")
@EntityScan(basePackages = "sn.isi.l3gl.core.entities")
public class TaskApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApiApplication.class, args);
    }
}

