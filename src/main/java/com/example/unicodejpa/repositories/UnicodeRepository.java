package com.example.unicodejpa.repositories;

import com.example.unicodejpa.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
}

