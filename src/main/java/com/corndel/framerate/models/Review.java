package com.corndel.framerate.models;

public class Review {
  private int id;
  public int movieId;
  public long createdAt;
  public String content;
  public int rating;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMovieId() {
    return movieId;
  }

  public void setMovieId(int movieId) {
    this.movieId = movieId;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Review{" +
            "id=" + id +
            ", movieId=" + movieId +
            ", createdAt=" + createdAt +
            ", content='" + content + '\'' +
            ", rating=" + rating +
            '}';
  }
}
