package com.boitenoire.model;

public class LoginData {

        private boolean success;
        private String authenticationMethod;


        public LoginData() {
        }

        public LoginData(boolean success, String authenticationMethod) {
            this.success = success;
            this.authenticationMethod = authenticationMethod;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getAuthenticationMethod() {
            return authenticationMethod;
        }

        public void setAuthenticationMethod(String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
        }

}
