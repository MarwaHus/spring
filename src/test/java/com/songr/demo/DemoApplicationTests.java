package com.songr.demo;

import com.songr.demo.controller.AlbumModel;
import com.songr.demo.controller.Hello;
import com.songr.demo.controller.Song;
import com.songr.demo.repositories.AlbumStoreInterface;
import com.songr.demo.repositories.SongRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private SongRepository songRepository;

	@Autowired
	private AlbumStoreInterface albumStoreInterface;
	@Test

	public void testSayHello() throws Exception {
		Hello hello = new Hello();
		String result = hello.sayHello();
		assertEquals("hello world", result);
	}
	@Test
	public void testAlbumModel() {
		AlbumModel album = new AlbumModel("Thriller", "Michael Jackson", 9, 357, "https://upload.wikimedia.org/wikipedia/en/5/55/Michael_Jackson_-_Thriller.png");

		assertEquals("Thriller", album.getTitle());
		assertEquals("Michael Jackson", album.getArtist());
		assertEquals(9, album.getSongCount());
		assertEquals(357, album.getLength());
		assertEquals("https://upload.wikimedia.org/wikipedia/en/5/55/Michael_Jackson_-_Thriller.png", album.getImageUrl());

		// Test setters
		album.setTitle("Dangerous");
		album.setArtist("Michael Jackson");
		album.setSongCount(14);
		album.setLength(462);
		album.setImageUrl("https://upload.wikimedia.org/wikipedia/en/8/8a/Michael_Jackson_Dangerous.png");

		assertEquals("Dangerous", album.getTitle());
		assertEquals("Michael Jackson", album.getArtist());
		assertEquals(14, album.getSongCount());
		assertEquals(462, album.getLength());
		assertEquals("https://upload.wikimedia.org/wikipedia/en/8/8a/Michael_Jackson_Dangerous.png", album.getImageUrl());
	}

	@Test
	public void testAddSongToAlbum() throws Exception {


	}
}
