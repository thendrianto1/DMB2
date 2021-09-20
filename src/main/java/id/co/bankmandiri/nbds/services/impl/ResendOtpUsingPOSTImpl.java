package id.co.bankmandiri.nbds.services.impl;

import java.util.*;
import id.co.bankmandiri.nbds.model.ResendOtpUsingPOSTP;
import id.co.bankmandiri.nbds.model.ResendOtpUsingPOSTResponseWrapper;
import id.co.bankmandiri.nbds.services.ResendOtpUsingPOSTI;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class ResendOtpUsingPOSTImpl implements ResendOtpUsingPOSTI {

    private static final Log logger = LogFactory.getLog(ResendOtpUsingPOSTImpl.class);

    /**
     * This method includes the business logic for the API implementation
     */
    @Override
    @CircuitBreaker(name = "mainService", fallbackMethod = "fallback")
    @Retry(name = "mainService", fallbackMethod = "fallback")
    @RateLimiter(name = "mainService")
    public ResendOtpUsingPOSTResponseWrapper execute(ResendOtpUsingPOSTP requestParams) {
        // TODO
        return new ResendOtpUsingPOSTResponseWrapper();
    }

    public <T> T error(int statusCode, Class<T> type, Exception exception) throws InstantiationException, IllegalAccessException {
        // TODO to write error response //NOSONAR
        return type.newInstance();
    }

    public ResendOtpUsingPOSTResponseWrapper fallback(ResendOtpUsingPOSTP pojo, Throwable exception) {
        logger.info("fallback method triggered with exception : " + exception.getMessage());
        return new ResendOtpUsingPOSTResponseWrapper();
    }
}
