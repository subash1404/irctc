package web.deepak.irctc.entity

import web.deepak.irctc.enum.SeatClass
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.io.Serializable

@Entity
@Table(name ="seat_table")
data class Seat
    (
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            val seatId : Int,
            val seatClass : SeatClass

            ) : Serializable
{
}