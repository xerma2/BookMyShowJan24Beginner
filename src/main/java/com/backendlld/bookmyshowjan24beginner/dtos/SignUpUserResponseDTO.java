package com.backendlld.bookmyshowjan24beginner.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpUserResponseDTO {
    private String message;
    private ResponseStatus status;
    private int userId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}


// BookTicket




