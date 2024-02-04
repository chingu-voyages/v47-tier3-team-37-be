package com.cornellnotes.Cornell.Notes.Backend.repositories;

import com.cornellnotes.Cornell.Notes.Backend.models.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long>{

}
