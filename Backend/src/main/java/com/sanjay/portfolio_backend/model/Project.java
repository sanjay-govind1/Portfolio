package com.sanjay.portfolio_backend.model;

import java.util.List;

public record Project(int id, String title, String description, List<String> techStack, String githubUrl) {
}
