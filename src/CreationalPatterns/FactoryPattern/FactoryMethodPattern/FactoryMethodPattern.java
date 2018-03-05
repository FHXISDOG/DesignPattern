package CreationalPatterns.FactoryPattern.FactoryMethodPattern;

import org.junit.Test;

public class FactoryMethodPattern {
    @Test
    public void testFactoryMethodPattern() {
        LoggerFactory factory;
        Logger logger;
        //获取文件日志记录类
        factory = new FileLoggerFacotry();
        logger = factory.createLogger();
        logger.writeLog();
        //获取数据库文件制作类
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
