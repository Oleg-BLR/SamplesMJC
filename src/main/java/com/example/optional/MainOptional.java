package com.example.optional;

public class MainOptional {
    public static void main(String[] args) {
//        User user = new User("Tony", "mail@mail.com"); //command option V - to create variable
        User user = new User("Tony", null); //command option V - to create variable

        System.out.println(user.getName());
        System.out.println(user.getMail().toUpperCase());
    }
}
    class User {
        private String name;
        private String mail;

        public User(String name, String mail) {
            this.name = name;
            this.mail = mail;
        }

        public String getName() {
            return name;
        }

        public String getMail() {
            return mail;
        }
    }


