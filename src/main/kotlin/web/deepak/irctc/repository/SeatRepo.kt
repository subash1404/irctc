package web.deepak.irctc.repository

import org.springframework.data.jpa.repository.JpaRepository
import web.deepak.irctc.entity.Seat
import web.deepak.irctc.enum.SeatClass

interface SeatRepo : JpaRepository<Seat,Int>{
}