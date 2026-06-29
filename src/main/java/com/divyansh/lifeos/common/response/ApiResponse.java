package com.divyansh.lifeos.common.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApiResponse<T> {

    boolean success;

    int status;

    String message;

    T data;

    LocalDateTime timestamp;

    /**
     * Success Response Factory
     */
    public static <T> ApiResponse<T> success(HttpStatus status,
                                             String message,
                                             T data) {

        return ApiResponse.<T>builder()
                .success(true)
                .status(status.value())
                .message(message)
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
    }

}