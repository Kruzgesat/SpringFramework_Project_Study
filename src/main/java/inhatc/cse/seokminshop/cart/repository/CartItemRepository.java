package inhatc.cse.seokminshop.cart.repository;

import inhatc.cse.seokminshop.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
