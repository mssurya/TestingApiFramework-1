package simple.testing.framework.ApiTests.responses;

import java.io.Serializable;

public class AuthResponse implements Serializable {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
