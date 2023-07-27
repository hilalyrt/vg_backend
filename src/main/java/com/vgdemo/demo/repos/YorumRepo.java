package com.vgdemo.demo.repos;

import com.vgdemo.demo.model.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YorumRepo extends JpaRepository<Yorum,Long> {

    List<Yorum> findByKullaniciKullaniciIdAndYorumId(Long kullaniciId, Long gonderiId);

    List<Yorum> findByKullaniciKullaniciId(Long kullaniciId);

    List<Yorum> findByGonderiGonderiId(Long gonderiId);

}
