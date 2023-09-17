package com.songr.demo;

import com.songr.demo.controller.AlbumModel;
import com.songr.demo.controller.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
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
}
