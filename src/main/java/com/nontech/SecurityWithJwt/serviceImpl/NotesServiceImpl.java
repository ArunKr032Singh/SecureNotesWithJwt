/**
 * Created By Arun Singh
 * Date:26-06-2025
 * Time:10:53
 * Project Name:SecurityWithJwt
 */

package com.nontech.SecurityWithJwt.serviceImpl;

import com.nontech.SecurityWithJwt.models.Note;
import com.nontech.SecurityWithJwt.repositotry.NotesRepo;
import com.nontech.SecurityWithJwt.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {
    @Autowired
    private NotesRepo notesRepo;

    @Override
    public Note createNoteForUser(String userName, String content) {
        Note note = new Note();
        note.setContact(content);
        note.setOwnerUserName(userName);
        Note savedNote = notesRepo.save(note);
        return savedNote;
    }

    @Override
    public Note updateNoteForUser(Long noteId, String content, String userName) {
        Note note = notesRepo.findById(noteId).orElseThrow(() -> new RuntimeException("Note not found"));
        note.setContact(content);
        Note updatedNote = notesRepo.save(note);
        return updatedNote;
    }

    @Override
    public void deleteNotesForUser(Long noteId, String userName) {
        notesRepo.deleteById(noteId);
    }

    @Override
    public List<Note> getNotesForUser(String userName) {
        List<Note> personalNotes = notesRepo.findByOwnerUserName(userName);
        return personalNotes;
    }
}
