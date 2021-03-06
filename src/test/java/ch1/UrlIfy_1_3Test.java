package ch1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UrlIfy_1_3Test {

    @Test
    public void when_emptyString_urlIfy_returns_emptyString() {
        assertArrayEquals(new char[]{}, new UrlIfy_1_3().urlIfy(new char[]{}, 0));
    }

    @Test
    public void when_noSpaceString_urlIfy_returns_sameString() {
        char[] expected = {'h', 'o', 'l', 'a'};
        char[] actual = {'h', 'o', 'l', 'a'};
        assertArrayEquals(expected, new UrlIfy_1_3().urlIfy(actual, 4));
    }

    @Test
    public void when_singleSpaceString_urlIfy_returns_urlIfiedString() {
        char[] expected = {'h', 'o', 'l', 'a', '%', '2', '0', 'b', 'i', 'e', 'n'};
        char[] actual = {'h', 'o', 'l', 'a', ' ', 'b', 'i', 'e', 'n', ' ', ' '};
        assertArrayEquals(expected, new UrlIfy_1_3().urlIfy(actual, 9));
    }

    @Test
    public void when_singleSpaceStringBegin_urlIfy_returns_urlIfiedString() {
        char[] expected = {'%', '2', '0', 'h', 'o', 'l', 'a', '%', '2', '0', 'b', 'i', 'e', 'n'};
        char[] actual = {' ', 'h', 'o', 'l', 'a', ' ', 'b', 'i', 'e', 'n', ' ', ' ', ' ', ' '};
        assertArrayEquals(expected, new UrlIfy_1_3().urlIfy(actual, 10));
    }

    @Test
    public void when_singleSpaceStringEnd_urlIfy_returns_urlIfiedString() {
        char[] expected = {'h', 'o', 'l', 'a', '%', '2', '0', 'b', 'i', 'e', 'n', '%', '2', '0'};
        char[] actual = {'h', 'o', 'l', 'a', ' ', 'b', 'i', 'e', 'n', ' ', ' ', ' ', ' ', ' '};
        assertArrayEquals(expected, new UrlIfy_1_3().urlIfy(actual, 10));
    }
}