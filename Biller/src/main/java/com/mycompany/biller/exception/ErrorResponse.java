package com.mycompany.biller.exception;

/**
 * Created by Omar Baidas
 */

public class ErrorResponse {
    private int errorCode;
    private String statusText;

    public int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}
