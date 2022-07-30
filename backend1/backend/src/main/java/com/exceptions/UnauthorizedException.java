package com.exceptions;
import com.enums.ServiceError;
public class UnauthorizedException extends AbstractServiceException{
    public UnauthorizedException(ServiceError serviceError){
        super(serviceError);
    }
}