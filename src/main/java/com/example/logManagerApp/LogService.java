package com.example.logManagerApp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Optional;


@Service

public class LogService {
    private List<LogEntry> logEntries = new ArrayList<>();

    public void addLogEntry(LogEntry entry){
        this.logEntries.add(entry);
    }

    public List<LogEntry> getAllLogEntries(){
        return this.logEntries;
    }

    // return wrapped in optional object
    public Optional<LogEntry> getLogEntry(UUID uuid){
        return logEntries.stream()
                .filter(logEntry -> logEntry.getUuid().equals(uuid))
                .findFirst();
    }

    // return true if deleted
    public boolean deleteLogEntry(UUID uuid){

        // GET LOG ENTRY
        Optional<LogEntry> logEntryOptional = getLogEntry(uuid);

        if (logEntryOptional.isPresent()) {
            logEntries.remove(logEntryOptional.get());
            return true;
        } else {
            return false;
        }
    }


    public Optional<LogEntry> updateLogEntry(UUID uuid, LogEntry updatedLogEntry) {
        // GET LOGENTRY
        Optional<LogEntry> logEntryOptional = getLogEntry(uuid);

        if (logEntryOptional.isPresent()) {
            // GET RETRIEVES THE VALUE WRAPPED IN OPTIONAL
            LogEntry existingLogEntry = logEntryOptional.get();
            // GET INDEX OF ENTRY
            int index = logEntries.indexOf(existingLogEntry);

            // REMOVE THE OLD ENTRY
            logEntries.remove(index);

            // ADD THE UPDATED ENTRY AT THE SAME INDEX
            logEntries.add(index, updatedLogEntry);
            return Optional.of(updatedLogEntry);
        } else {
            return Optional.empty();
        }
    }


}
