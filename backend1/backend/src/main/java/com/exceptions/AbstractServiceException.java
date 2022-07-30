package com.exceptions;
import com.enums.ServiceError;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractServiceException extends Exception {

    protected final ServiceError serviceError;
}