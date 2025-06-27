/**
 * Created By Arun Singh
 * Date:26-06-2025
 * Time:10:50
 * Project Name:SecurityWithJwt
 */

package com.nontech.SecurityWithJwt.repositotry;

import com.nontech.SecurityWithJwt.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepo extends JpaRepository<Note,Long> {
    List<Note> findByOwnerUserName(String ownerUserName);
}
