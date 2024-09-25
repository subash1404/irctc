//package web.deepak.irctc.controller.mutationController
//
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.graphql.data.method.annotation.MutationMapping
//import org.springframework.stereotype.Service
//import web.deepak.irctc.entity.Train
//import web.deepak.irctc.service.TrainService
//
//@Service
//class TrainMController @Autowired
//constructor(
//    private val trainService: TrainService
//)
//{
//    @MutationMapping
//    fun addTrain(tid:String,tname : String,startStationId:Int, endStationId : Int) : Train
//    {
//        return trainService.createTrain(tid,tname, startStationId,endStationId)
//    }
//}