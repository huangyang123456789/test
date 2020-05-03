package com.work.demoofgradle.entity;

/**
 * @Author: SinG
 * @Date: 2020/5/3 15:45
 */
public enum ReturnType {
        Success("成功"),
        failure("失败");

        private String type;
        ReturnType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
}
