/*package com.javaclimb.drug;public class test {
}*/
package com.javaclimb.drug;

        import org.junit.jupiter.api.Test;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLoggingApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 测试日志输出
     * SLF4J 日志级别从小到大trace>debug>info>warn>error
     */
    @Test
    void logTest() {
        //日志级别 由低到高
        logger.trace("trace 级别日志");
        logger.debug("debug 级别日志");
        logger.info("info 级别日志");
        logger.warn("warn 级别日志");
        logger.error("error 级别日志");
    }
}