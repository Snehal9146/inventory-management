package InventoryManagementSystem.Inventory.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import InventoryManagementSystem.Inventory.Model.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {
}
