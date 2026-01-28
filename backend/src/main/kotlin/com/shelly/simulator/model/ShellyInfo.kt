package com.shelly.simulator.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ShellyInfo(
    val type: String = "SHRGBW2",
    val mac: String = "B0F1EC000001",
    val fw: String = "1.0.0-simulator",
    @JsonProperty("fw_id")
    val fwId: String = "20250128-100000",
    @JsonProperty("has_update")
    val hasUpdate: Boolean = false
)
