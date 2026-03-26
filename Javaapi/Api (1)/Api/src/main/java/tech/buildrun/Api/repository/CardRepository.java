package tech.buildrun.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.Api.model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}