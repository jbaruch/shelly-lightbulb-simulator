package com.shelly.simulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Response model for the /shelly endpoint following Shelly API v1 specification.
 * Used for device discovery and identification.
 */
data class ShellyInfo(
    /** Device model/type identifier - SHBLB-1 is the Shelly Bulb RGBW */
    val type: String = "SHBLB-1",
    /** Device MAC address */
    val mac: String = "B0F1EC000001",
    /** Firmware version string in Shelly format: YYYYMMDD-HHMMSS/version@commit */
    val fw: String = "20250128-100000/v1.0.0@simulator",
    /** Firmware build ID in YYYYMMDD-HHMMSS format */
    @JsonProperty("fw_id")
    val fwId: String = "20250128-100000",
    /** Indicates if a firmware update is available */
    @JsonProperty("has_update")
    val hasUpdate: Boolean = false
)
