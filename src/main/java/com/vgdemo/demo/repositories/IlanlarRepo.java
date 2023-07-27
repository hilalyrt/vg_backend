package com.vgdemo.demo.repositories;

<<<<<<< Updated upstream
import com.vgdemo.demo.model.Ilanlar;
import com.vgdemo.demo.model.Sirket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IlanlarRepo extends JpaRepository<Ilanlar, Integer> {
    List<Ilanlar> findBySirket(Sirket sirket);
}
=======
public interface IlanlarRepo {
}
>>>>>>> Stashed changes
