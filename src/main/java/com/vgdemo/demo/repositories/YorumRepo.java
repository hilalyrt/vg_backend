package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface YorumRepo extends JpaRepository<Yorum, Long> {
    List<Yorum> findByKullaniciKullaniciIdAndGonderigoderiId(Long userId,Long postId);

    List<Yorum> findByKullaniciKullaniciId(Long userId);

    List<Yorum> findByGonderiGoderiId(Long postId);

    @Query (value = "select 'commented on', c.post_id, u.avatar, u.user_name from"+"comment c left join user u on u.id=c.user_id"+"where c.post_id in :postIds limit 5",nativeQuery = true)

    List<Object> findKullaniciYorumByGonderiId(@Param("postIds") List<Long>postIds);

 }
