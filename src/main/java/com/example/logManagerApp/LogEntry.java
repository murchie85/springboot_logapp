package com.example.logManagerApp;
import java.util.UUID;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LogEntry {
    public UUID uuid = UUID.randomUUID();
    public LocalDateTime timestampLocal = LocalDateTime.now();
    public enum LogLevel{
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL
    };
    public LogLevel logLevel;
    public String message;


    public LogEntry(UUID uuid, LocalDateTime timestampLocal, LogLevel logLevel, String message){
        this.uuid = uuid;
        this.timestampLocal = timestampLocal;
        this.logLevel = logLevel;
        this.message = message;
    }

}
