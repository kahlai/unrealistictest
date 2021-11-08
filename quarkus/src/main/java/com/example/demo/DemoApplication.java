package com.example.demo;

import javax.enterprise.inject.spi.CDI;
import com.example.service.DemoService;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class DemoApplication{

	public static void main(String... args) {
		Quarkus.run(MyApp.class, args);
	}
	public static class MyApp implements QuarkusApplication {
        @Override
        public int run(String... args) throws Exception {
            long startTime = System.currentTimeMillis();
			DemoService ds =CDI.current().select(DemoService.class).get();
			ds.runDemo();
			long totalTime = System.currentTimeMillis() - startTime;
			System.out.println("done "  + totalTime + "ms");
            return 0;
        }
    }

}
