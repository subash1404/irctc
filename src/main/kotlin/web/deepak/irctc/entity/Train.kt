package web.deepak.irctc.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

import jakarta.persistence.Table
import java.io.Serializable

@Entity
@Table(name="train_table")
data class Train
    (
        @Id
            val trainId : String,

        var trainName : String,

        @ManyToOne
            @JoinColumn(name="start_station_id", nullable = false)
            var startStation : Station,

        @ManyToOne
            @JoinColumn(name="end_station_id", nullable = false)
            var endStation : Station,



        ) : Serializable
{
}