package com.yuye.light.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2020/9/24 0:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemSkuReqVO {
    private Long id;
    private Long itemId;
    private List<Long> ids;
    private List<Long> itemIds;
    private Long updated;
    private Long created;
}
