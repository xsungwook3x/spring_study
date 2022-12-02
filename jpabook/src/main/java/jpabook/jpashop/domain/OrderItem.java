package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name="ORDER_ITEM_ID")
    private Long id;

//    @Column(name="ORDER_ID")
//    private Long orderId;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item itme;
//    @Column(name = "ITEM_ID")
//    private Long itemID;

    //양방향
//    @OneToMany(mappedBy = "member")
//    private List<Order> orders = new ArrayList<>();
    private int orderPrice;

    private int count;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public int getOrderPrice() {
        return orderPrice;
    }



    public void setCount(int count) {
        this.count = count;
    }

    public Item getItme() {
        return itme;
    }

    public Order getOrder() {
        return order;
    }

    public void setItme(Item itme) {
        this.itme = itme;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
}
