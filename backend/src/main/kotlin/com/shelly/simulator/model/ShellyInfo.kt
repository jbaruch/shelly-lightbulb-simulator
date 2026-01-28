package com.shelly.simulator.model

/**
 * Response model for the /shelly endpoint following Shelly API v1 specification.
 * Used for device discovery and identification.
 */
data class ShellyInfo(
    /** Device model/type identifier - SHBLB-1 is the Shelly Bulb RGBW */
    val type: String = "SHBLB-1",
    /** Device MAC address */
    val mac: String = "B0F1EC000001",
    /** Whether authentication is enabled */
    val auth: Boolean = false,
    /** Firmware version string in Shelly format: YYYYMMDD-HHMMSS/branch@commit */
    val fw: String = "20250128-100000/master@simulator",
    /** Long device ID format support */
    val longid: Int = 1,
    /** Whether the device is discoverable on the network */
    val discoverable: Boolean = true
)
