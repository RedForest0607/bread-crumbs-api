import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "user_detail")
data class UserDetail(
    @Id
    @Column(name = "user_id")
    val userId: Long,

    @Column(name = "full_name")
    val fullName: String,

    val address: String,

    @Column(name = "phone_number")
    val phoneNumber: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now(),

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id")
    val user: User
)