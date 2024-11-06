package inhatc.cse.seokminshop.order.repository;

import inhatc.cse.seokminshop.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
