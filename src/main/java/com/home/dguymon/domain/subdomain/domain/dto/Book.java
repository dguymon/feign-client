package com.home.dguymon.domain.subdomain.domain.dto;

public class Book {
  
  private String isbn;
  private String author;
  private String title;
  private String synopsis;
  private String language;
    
  public Book() {
    
  }
  
  public String getISBN() {
    return this.isbn;
  }
  
  public void setISBN(String isbn) {
    this.isbn = isbn;
  }
  
  public String getAuthor() {
    return this.author;
  }
  
  public void setAuthor(String author) {
    this.author = author;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getSynopsis() {
    return this.synopsis;
  }
  
  public void setSynopsis(String synopsis) {
    this.synopsis = synposis;
  }
  
  public String getLanguage() {
    return this.language;
  }
  
  public void setLanguage(String language) {
    this.language = language;
  }
}