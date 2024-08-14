package com.aruiz.microservices.inventory.controller.dto;

public record InventoryRequest(String skuCode, Integer quantity) {
}
