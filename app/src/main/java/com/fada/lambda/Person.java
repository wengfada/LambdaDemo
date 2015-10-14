package com.fada.lambda;

import java.util.List;

public class Person {


    private int retcode;
    private List<DataEntity> data;

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public int getRetcode() {
        return retcode;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {

        private int id;
        private String title;
        private int type;
        private List<ChildrenEntity> children;

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setChildren(List<ChildrenEntity> children) {
            this.children = children;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getType() {
            return type;
        }

        public List<ChildrenEntity> getChildren() {
            return children;
        }

        public static class ChildrenEntity {

            private int id;
            private String title;
            private int type;
            private String url;

            public void setId(int id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setType(int type) {
                this.type = type;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public int getType() {
                return type;
            }

            public String getUrl() {
                return url;
            }
        }
    }
}
