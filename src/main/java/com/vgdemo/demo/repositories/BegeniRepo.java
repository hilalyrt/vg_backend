package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Begeni;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BegeniRepo extends JpaRepository<Begeni,Long> {

    List<Begeni> findByKullaniciKullaniciIdAndGonderiGonderiId(Long kullaniciId, Long gonderiId);

    List<Begeni> findByKullaniciKullaniciId(Long kullaniciId);

    List<Begeni> findByGonderiGonderiId(Long gonderiId);
}
