package com.dto;
import lombok.Data;

    @Data
    public class dto {
        private String Email;
        private String password;

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

