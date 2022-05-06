package com.samsung.repository;

import com.samsung.domain.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void shouldInsertAuthor(){
        Author expectedAuthor = Author.builder()
                .id(4)
                .name("Ivan")
                .build();
        authorRepository.save(expectedAuthor);
        Author actualAuthor = authorRepository.getById(4);

        assertThat(actualAuthor).isEqualTo(expectedAuthor);
    }
}