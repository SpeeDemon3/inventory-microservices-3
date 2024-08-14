package com.aruiz.microservices.inventory.controller.dto;

public record InventoryResponse(String skuCode, boolean isInStock) {
}
