package jjfactory.post.like

import jjfactory.post.post.Post
import jjfactory.post.user.User
import javax.persistence.*

@Entity
@Table(name = "like")
open class Like (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? ,

    @ManyToOne(fetch = FetchType.LAZY)
    val post:Post,
    @ManyToOne(fetch = FetchType.LAZY)
    val user:User
)