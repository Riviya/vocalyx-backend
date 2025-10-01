package com.example.aisales_backend.service.interfaces;

import com.example.aisales_backend.dto.history.CallDto;
import java.util.List;

public interface IHistoryService {

    /**
     * Retrieve all calls, latest first
     */
    List<CallDto> getAllCallsLatestFirst();
    List<CallDto> getAllCallsByIDLatestFirst(Long contactId);
}