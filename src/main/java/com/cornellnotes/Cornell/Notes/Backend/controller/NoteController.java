package com.cornellnotes.Cornell.Notes.Backend.controller;

import com.cornellnotes.Cornell.Notes.Backend.models.Note;
import com.cornellnotes.Cornell.Notes.Backend.repositories.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteRepository noteRepository;

    public NoteController(final NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public Iterable<Note> getAllNotes(){
        return this.noteRepository.findAll();
    }

    @PostMapping
    public String createNote(@RequestBody Note note){
        note.setDateCreated(new Date());
        noteRepository.save(note);
        return "Note Saved Successfully!";
    }

    @DeleteMapping
    public String deleteNote(@RequestBody Long id){
        noteRepository.deleteById(id);
        return "note with id " + id + " deleted";
    }

}

