package jjfactory.post.comment

import jjfactory.post.post.Post
import jjfactory.post.user.User
import javax.persistence.*

@Entity
class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @ManyToOne(fetch = FetchType.LAZY)
    val post:Post,
    @ManyToOne(fetch = FetchType.LAZY)
    val user: User,
    val content:String

)