package com.codeclan.JavasicPark.repositories.Visitors;
import com.codeclan.JavasicPark.Models.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
