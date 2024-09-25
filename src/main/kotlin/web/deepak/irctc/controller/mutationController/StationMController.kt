//package web.deepak.irctc.controller.mutationController
//
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.graphql.data.method.annotation.MutationMapping
//import org.springframework.graphql.data.method.annotation.QueryMapping
//import org.springframework.stereotype.Component
//import org.springframework.stereotype.Controller
//import org.springframework.stereotype.Service
//import web.deepak.irctc.entity.Station
//import web.deepak.irctc.service.StationService
//
//@Component
//class StationMController @Autowired
//constructor(
//    private val stationService: StationService,
//)
//{
//    @MutationMapping
//    fun addStation(name : String) : Station
//    {
//        return stationService.createStation(name)
//    }
//}