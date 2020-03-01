package sdjzu.edu.community.exception;

/**
 * Created by Lwq on 2020/3/1 14:14
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND("你的问题不存在了，要不换一个试试");

    @Override
    public String getMessage() {
        return message;
    }

    private  String message;

    CustomizeErrorCode(String message){
        this.message=message;
    }
}
