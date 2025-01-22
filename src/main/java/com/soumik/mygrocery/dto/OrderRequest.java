package com.soumik.mygrocery.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderRequest {
    private Long customerId;
    private List<Long> productIds;
}
