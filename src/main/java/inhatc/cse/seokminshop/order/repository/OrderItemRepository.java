package inhatc.cse.seokminshop.order.repository;

import inhatc.cse.seokminshop.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
