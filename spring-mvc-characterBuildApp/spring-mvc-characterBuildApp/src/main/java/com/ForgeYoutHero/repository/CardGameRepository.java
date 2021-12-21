package com.ForgeYoutHero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ForgeYourHero.entity.CardGame;


@Repository
public interface CardGameRepository extends JpaRepository<CardGame, String> {

}
