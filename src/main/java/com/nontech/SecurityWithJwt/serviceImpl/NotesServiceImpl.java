/**
 * Created By Arun Singh
 * Date:26-06-2025
 * Time:10:53
 * Project Name:SecurityWithJwt
 */

package com.nontech.SecurityWithJwt.serviceImpl;

import com.nontech.SecurityWithJwt.models.Note;
import com.nontech.SecurityWithJwt.service.NotesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {

    @Override
    public Note createNoteForUser(String userName, String content) {
        return null;
    }

    @Override
    public Note updateNoteForUser(Long noteId, String content, String userName) {
        return null;
    }

    @Override
    public void deleteNotesForUser(Long noteId, String userName) {

    }

    @Override
    public List<Note> getNotesForUser(String userName) {
        return List.of();
    }
}
