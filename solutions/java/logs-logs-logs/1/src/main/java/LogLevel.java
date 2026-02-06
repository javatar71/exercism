public enum LogLevel {
    TRACE("TRC",1),
    DEBUG("DBG",2),
    INFO("INF",4),
    WARNING("WRN",5),
    ERROR("ERR",6),
    FATAL("FTL",42),
    UNKNOWN("UNK",0);

    private int msg_code;
    private String msg;

    LogLevel(String msg, int msg_code){
        this.msg = msg;
        this.msg_code = msg_code;
    }

    String getMsg(){
        return this.msg;
    }

    int getCode(){
        return this.msg_code;
    }

    static LogLevel getObject(String text_msg){
        for(LogLevel a: values()){
            if(text_msg.equals(a.getMsg())){
                return a;
            }
        }
        return LogLevel.UNKNOWN;
    }
}
