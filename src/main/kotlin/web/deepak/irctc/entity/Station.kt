package web.deepak.irctc.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.io.Serializable

@Entity
@Table(name ="station_table")
data class Station
    (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val stationId: Int?=null,

        var stationName : String

            ): Serializable