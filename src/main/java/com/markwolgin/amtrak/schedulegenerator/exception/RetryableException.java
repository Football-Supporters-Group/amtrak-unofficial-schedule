package com.markwolgin.amtrak.schedulegenerator.exception;

import lombok.Getter;
import org.springframework.http.HttpStatusCode;

@Getter
public class RetryableException extends RuntimeException {

    private final String reason;
    private final HttpStatusCode httpStatusCode;

    public RetryableException(final String reason, final HttpStatusCode httpStatusCode) {
        super();
        this.reason = reason;
        this.httpStatusCode = httpStatusCode;
    }

    public RetryableException(final String reason, final HttpStatusCode httpStatusCode,
                              final Throwable throwable) {
        super(throwable);
        this.reason = reason;
        this.httpStatusCode = httpStatusCode;
    }

    public RetryableException(final String reason, final HttpStatusCode httpStatusCode,
                              final String message, final Throwable throwable) {
        super(message, throwable);
        this.reason = reason;
        this.httpStatusCode = httpStatusCode;
    }

    public RetryableException(final String reason, final HttpStatusCode httpStatusCode,
                              final String message) {
        super(message);
        this.reason = reason;
        this.httpStatusCode = httpStatusCode;
    }

}