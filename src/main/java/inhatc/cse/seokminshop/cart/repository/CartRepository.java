package inhatc.cse.seokminshop.cart.repository;

import inhatc.cse.seokminshop.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
