package inhatc.cse.seokminshop.order.entity;

import inhatc.cse.seokminshop.member.entity.Member;
import inhatc.cse.seokminshop.order.constant.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;            //OrderID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime orderDate;     //Order Date

    @Enumerated(EnumType.STRING)        //Order Status
    private OrderStatus orderStatus;

}
