package com.WebApplication.ChatApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.WebApplication.ChatApplication.Model.Story;

public interface StoryRepository extends JpaRepository<Story, Integer> {

}
