package id.co.bankmandiri.nbds.services.impl;

import java.util.*;
import id.co.bankmandiri.nbds.model.LogoutUsingPOSTP;
import id.co.bankmandiri.nbds.model.LogoutUsingPOSTResponseWrapper;
import id.co.bankmandiri.nbds.services.LogoutUsingPOSTI;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class LogoutUsingPOSTImpl implements LogoutUsingPOSTI {

    private static final Log logger = LogFactory.getLog(LogoutUsingPOSTImpl.class);

    /**
     * This method includes the business logic for the API implementation
     */
    @Override
    @CircuitBreaker(name = "mainService", fallbackMethod = "fallback")
    @Retry(name = "mainService", fallbackMethod = "fallback")
    @RateLimiter(name = "mainService")
    public LogoutUsingPOSTResponseWrapper execute(LogoutUsingPOSTP requestParams) {
        // TODO
        return new LogoutUsingPOSTResponseWrapper();
    }

    public <T> T error(int statusCode, Class<T> type, Exception exception) throws InstantiationException, IllegalAccessException {
        // TODO to write error response //NOSONAR
        return type.newInstance();
    }

    public LogoutUsingPOSTResponseWrapper fallback(LogoutUsingPOSTP pojo, Throwable exception) {
        logger.info("fallback method triggered with exception : " + exception.getMessage());
        return new LogoutUsingPOSTResponseWrapper();
    }
}
