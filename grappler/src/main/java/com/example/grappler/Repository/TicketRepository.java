package com.example.grappler.Repository;

import com.example.grappler.Entity.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Tickets,Long> {
}
