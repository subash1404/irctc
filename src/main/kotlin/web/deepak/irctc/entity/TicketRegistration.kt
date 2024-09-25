package web.deepak.irctc.entity

import web.deepak.irctc.enum.SeatAvail
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.io.Serializable
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint
import java.time.LocalDateTime

@Entity
data class TicketRegistration(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val ticketId: Long? = null,

        @ManyToOne
        @JoinColumn(name = "seat_id", nullable = false)
        val seat: Seat,

        @OneToOne
        @JoinColumn(name = "user_id", nullable = false)
        val user: User,

        @ManyToOne
        @JoinColumn(name = "train_id", nullable = false)
        val train: Train,

        @ManyToOne
        @JoinColumn(name = "start_station_id", nullable = false)
        val startStation: Station,

        @ManyToOne
        @JoinColumn(name = "dest_station_id", nullable = false)
        val destStation: Station,

        val status: SeatAvail = SeatAvail.CONFIRMED,

        val bookedAt: LocalDateTime = LocalDateTime.now()

) : Serializable
