//package web.deepak.irctc.controller.mutationController
//
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.graphql.data.method.annotation.MutationMapping
//import org.springframework.graphql.data.method.annotation.QueryMapping
//import org.springframework.stereotype.Component
//import org.springframework.stereotype.Controller
//import org.springframework.stereotype.Service
//import web.deepak.irctc.entity.User
//import web.deepak.irctc.enum.ReferenceDoc
//import web.deepak.irctc.service.UserService
//
//@Component
//class UserMController @Autowired
//constructor(
//    private val userService: UserService
//)
//{
//    @MutationMapping
//    fun addUser(uname : String, refDoc : ReferenceDoc, refId :String) : User
//    {
//        return userService.createUser(uname,refDoc,refId)
//    }
//
//}