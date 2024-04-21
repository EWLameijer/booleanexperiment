package com.example.booleanexperiment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping
    public Iterable<Item> getAll() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Item add(@RequestBody Item item) {
        return itemRepository.save(item);
    }

}
