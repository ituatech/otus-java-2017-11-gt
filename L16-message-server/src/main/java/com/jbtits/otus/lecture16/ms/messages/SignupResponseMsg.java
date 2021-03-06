package com.jbtits.otus.lecture16.ms.messages;

import com.jbtits.otus.lecture16.ms.app.Msg;

public class SignupResponseMsg extends Msg {
    private final long userId;

    public SignupResponseMsg(String uuid, long userId) {
        super(SignupResponseMsg.class, uuid);
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }
}
