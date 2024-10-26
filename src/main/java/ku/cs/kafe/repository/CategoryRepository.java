/**
 * StudentId: 6510450861
 * Name: Moradop Hengprasert
 * */
package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    Category findByName(String name);
}