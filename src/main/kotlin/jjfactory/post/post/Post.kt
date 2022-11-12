package jjfactory.post.post

import jjfactory.post.user.User
import javax.persistence.*

@Entity
class Post (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    val user:User,
    val title:String,
    val content:String
){
    fun create(user: User){

    }
}