package ru.mayak.z23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mayak.z23.domain.QBlock;

public interface QBlocksRepository extends JpaRepository<QBlock, Integer> {
}
