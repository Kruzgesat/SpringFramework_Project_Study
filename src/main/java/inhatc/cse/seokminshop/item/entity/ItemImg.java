package inhatc.cse.seokminshop.item.entity;

import inhatc.cse.seokminshop.common.entity.BaseEntity;
import inhatc.cse.seokminshop.item.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ItemImg extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_img_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private String imageName;
    private String oriImgName;
    private String imgUrl;
    private String repImgYn;

    public void updateItemImg(String oriImgName, String imageName, String imgUrl) {
        this.oriImgName = oriImgName;
        this.imageName = imageName;
        this.imgUrl = imgUrl;
    }

}
