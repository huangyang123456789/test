package cn.edu.zwu.usermodel.util;

/**
 * @Author: yjf
 * @Date: 2020/4/30 16:53
 */
public enum ResponseCode {
        //自定义的状态码
        ERRO(0,"失败"),
        SUCCESS(1,"成功"),
        SYSTEMERRO(500,"系统异常");
        //错误码
        public Integer code;
        //提示信息
        public String message;

        //构造函数
        ResponseCode(Integer code,String message){
            this.code = code;
            this.message = message;
        }

        //获取状态码
        public Integer getCode(){
            return code;
        }

        //获取提示信息
        public String getMessage(){
            return message;
        }

    }

