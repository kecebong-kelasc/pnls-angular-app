/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.kecebong.pnlsangularapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import lab.kecebong.pnlsangularapp.entity.Penulis;
/**
 *
 * @author User
 */
@Repository
public interface PenulisRepo extends JpaRepository<Penulis, String> {
	Penulis findOneById(String id);
    
    
}
