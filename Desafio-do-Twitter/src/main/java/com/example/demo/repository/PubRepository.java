package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.PubModel;
import com.example.demo.valueobject.PubCountByHourOfDayVO;

import java.util.List;

public interface PubRepository extends JpaRepository<PubModel, Long> {
	
	 @Query("SELECT new  com.example.demo.valueobject.PubCountByHourOfDayVO(count (1), YEAR(t.createdAt), MONTH(t.createdAt), DAY(t.createdAt), HOUR(t.createdAt)) " +
	            "FROM PubModel t GROUP BY YEAR(t.createdAt), MONTH(t.createdAt), DAY(t.createdAt), HOUR(t.createdAt) " +
	            "ORDER BY YEAR(t.createdAt), MONTH(t.createdAt), DAY(t.createdAt), HOUR(t.createdAt)")
	    public List<PubCountByHourOfDayVO> listPubCountByHourOfDay();
}
