package com.ai.model;

import java.io.Serializable;
<<<<<<< HEAD

public class Color implements Serializable {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    private int id;
    private String name;
    private String code;
=======
>>>>>>> 84cbc97f1ae5ffaa584d12f89206f91e6f919e58

public class Color implements Serializable{

            private int id;
            private String name;
            private String code;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public Color() {}
}
