package com.measurement.exception;

public class QuantityMeasurementException extends RuntimeException {
        public ExceptionType type;

        public enum ExceptionType {
            NULL_VALUE
        }

        public QuantityMeasurementException(String message, ExceptionType type) {
            super(message);
            this.type = type;
        }

}
