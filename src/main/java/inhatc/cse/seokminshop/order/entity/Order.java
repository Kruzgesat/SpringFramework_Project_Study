package inhatc.cse.seokminshop.order.entity;

import inhatc.cse.seokminshop.common.entity.BaseEntity;
import inhatc.cse.seokminshop.member.entity.Member;
import inhatc.cse.seokminshop.order.constant.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends BaseEntity {

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order" , cascade = CascadeType.ALL, orphanRemoval = true)
    //Relation with OrderItem, Manage by OrderItems' order, Cascading All Types, Remove If Object becomes Orphan

    private final List<OrderItem> orderItems = new ArrayList<>();


}
