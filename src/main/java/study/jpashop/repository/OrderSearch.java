package study.jpashop.repository;

import lombok.Getter;
import lombok.Setter;
import study.jpashop.domain.OrderStatus;

@Getter
@Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;
}
