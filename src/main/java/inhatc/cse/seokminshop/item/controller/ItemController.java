package inhatc.cse.seokminshop.item.controller;


import inhatc.cse.seokminshop.item.dto.ItemDataDto;
import inhatc.cse.seokminshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/admin/item/add")
    public String itemAdd() {
        return "item/add";
    }

    @GetMapping("/admin/items")
    public String itemList() {
        return "item/list";
    }

    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model) {
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명")
                .itemDetail("상품 상세 설명")
                .price(10000)
                .stockNumber(100)
                .build();
        
        model.addAttribute("item", itemDto);

        return "/item/thymeleaf1";
    }

    @GetMapping("item/thymeleaf2")
    public String thymeleaf2(ItemDataDto ItemDataDto,
                             Model model)  {
        System.out.println("======" + ItemDataDto);

        model.addAttribute("item", ItemDataDto);

        return "/item/thymeleaf2";
    }

    @GetMapping("item/thymeleaf3")
    public String thymeleaf3(ItemDto ItemDto,
                             Model model)  {

        List<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto =ItemDto.builder()
                    .id((long) i)
                    .itemNm("상품" + i)
                    .itemDetail("상품 상세 설명" + i)
                    .price(10000 * i)
                    .stockNumber(100 + i)
                    .build();

            itemDtoList.add(itemDto);
        }
        model.addAttribute("item", itemDtoList);
        return "/item/thymeleaf3";
    }

    @GetMapping("item/thymeleaf4")
    public String thymeleaf4(ItemDto ItemDto,
                             Model model)  {

        List<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto =ItemDto.builder()
                    .id((long) i)
                    .itemNm("상품" + i)
                    .itemDetail("상품 상세 설명" + i)
                    .price(10000 * i)
                    .stockNumber(100 + i)
                    .build();

            itemDtoList.add(itemDto);
        }
        model.addAttribute("item", itemDtoList);
        return "/item/thymeleaf4";
    }

    @GetMapping("item/thymeleaf5")
    public String thymeleaf5(ItemDto ItemDto,
                             Model model)  {

        List<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto =ItemDto.builder()
                    .id((long) i)
                    .itemNm("상품" + i)
                    .itemDetail("상품 상세 설명" + i)
                    .price(10000 * i)
                    .stockNumber(100 + i)
                    .build();

            itemDtoList.add(itemDto);
        }
        model.addAttribute("item", itemDtoList);
        return "/item/thymeleaf5";
    }

}
