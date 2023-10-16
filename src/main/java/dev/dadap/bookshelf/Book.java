package dev.dadap.bookshelf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection= "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private ObjectId id;
    private String thumbnailUrl;
    private String isbn;
    private String title;
    private String shortDescription;
    private List<String> categories;
    private List<String> authors;
    @DocumentReference
    private List<Review> reviewId;
}
