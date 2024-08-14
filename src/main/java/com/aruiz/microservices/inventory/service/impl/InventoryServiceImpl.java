package com.aruiz.microservices.inventory.service.impl;

import com.aruiz.microservices.inventory.controller.dto.InventoryRequest;
import com.aruiz.microservices.inventory.model.Inventory;
import com.aruiz.microservices.inventory.repository.InventoryRepository;
import com.aruiz.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @Override
    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }

}
