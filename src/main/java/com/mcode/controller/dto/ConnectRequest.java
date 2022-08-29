package com.mcode.controller.dto;

import com.mcode.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}