package com.Gnaneshwar.JobApp.repo;

import com.Gnaneshwar.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    private final List<JobPost> jobs = new ArrayList<>(of(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    of("Core Java", "J2EE", "Spring Boot", "Hibernate")),

            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    of("HTML", "CSS", "JavaScript", "React")),

            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    of("Python", "Machine Learning", "Data Analysis")),

            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    of("Networking", "Cisco", "Routing", "Switching")),

            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    of("iOS Development", "Android Development", "Mobile App"))
    ));
    // Method to save a job post object into ArrayList
    public void addJob(JobPost job) {
        jobs.add(job);

        System.out.println("New job added: " + jobs);
    }

    // Method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return new ArrayList<>(jobs); // Returning a new list to avoid modification outside the class
    }
}
