package com.codingwithmitch.mviexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Alert(

    @Expose
    @SerializedName("engineSpeed")
    private val engineSpeed : Double? = null,

    @Expose
    @SerializedName("exhaust_temperature")
    private val exhaust_temperature : Double? = null,

    @Expose
    @SerializedName("load")
    private val load : Double? = null,

    @Expose
    @SerializedName("firing_pressure")
    private val firing_pressure : Double? = null,

    @Expose
    @SerializedName("scavenging_pressure")
    private val scavenging_pressure : Double? = null,

    @Expose
    @SerializedName("compression_pressure")
    private val compression_pressure : Double? = null,

    @Expose
    @SerializedName("break_power")
    private val break_power : Double? = null,

    @Expose
    @SerializedName("imep")
    private val imep : Double? = null,

    @Expose
    @SerializedName("Torque_engine")
    private val Torque_engine : Double? = null,

    @Expose
    @SerializedName("bmep")
    private val bmep : Double? = null,

    @Expose
    @SerializedName("injection_timing")
    private val injection_timing : Double? = null,

    @Expose
    @SerializedName("fuel_flow_rate")
    private val fuel_flow_rate : Double? = null

) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return super.toString()
    }
}
